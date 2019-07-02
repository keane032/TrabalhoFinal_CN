import decoder from 'jwt-decode'

const TOKEN_KEY = 'user_token'

export function getToken() {
  return window.localStorage.getItem(TOKEN_KEY)
}

export function clearToken() {
  window.localStorage.removeItem(TOKEN_KEY)
}

export function setToken(token) {
  window.localStorage.setItem(TOKEN_KEY, token)
}

export function getTokenFromRes(res) {
  if (res.headers.has('Authorization')) {
    let token = res.headers.get('Authorization')
    token = token.replace('Bearer ', '')
    return token
  }
  return undefined
}

export function getUserRole(token) {
  return token && decoder(token).role || undefined
}

export function requireRoles(roles, redirect = '/erro') {
  return function(to, from, next) {
    let role = getUserRole(getToken())
    if(roles.includes(role)) {
      return next()
    }

    next(redirect)

  }
}

export function authBeforeEach(to, from, next) {
  if(to.meta) {
    let redirect = to.meta.redirect
    let reqAuth = to.meta.requireAuth
    if(reqAuth) {
      if(!isLoggedIn() || !isUserRoleAllowed(to)) {
        return next(redirect)
      }
    }
  }

  return next()

}

export function isLoggedIn() {
  let token = getToken()
  return token && !isTokenExpired(token)
}

export function getUserId() {
  if(isLoggedIn()) {
    return decoder(getToken()).user_id
  }
  return undefined;
}

function getTokenExpiration(encodedToken) {
  let token = decoder(encodedToken)
  if (token && token.exp) {
    let date = new Date(0)
    date.setUTCSeconds(token.exp)
    return date
  }
  return undefined
}

function isTokenExpired(token) {
  let expDate = getTokenExpiration(token)
  return !expDate || expDate < new Date()
}

function isUserRoleAllowed(route) {
  let role = getUserRole(getToken())
  let roles = route.meta? route.meta.roles : undefined
  if(roles) {
    return roles.includes(role)
  }

  return true

}

