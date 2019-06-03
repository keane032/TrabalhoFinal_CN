import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Cadastro from './views/Cadastro.vue'
import CadastrarRefeicao from './views/CadastrarRefeicao.vue'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path:'/CadastrarRefeicao',
      name:'cadastrarRefeicao',
      component: CadastrarRefeicao  
    },
    {
      path:'/cadastrar',
      name:'cadastro',
      component: Cadastro
    },
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/about',
      name: 'about',
      // route level code-splitting
      // this generates a separate chunk (about.[hash].js) for this route
      // which is lazy-loaded when the route is visited.
      component: function () { 
        return import(/* webpackChunkName: "about" */ './views/About.vue')
      }
    }
  ]
})
