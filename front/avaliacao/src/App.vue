<template>
  <div id="app">
    <div  v-bind:style="{ 'background-image': 'url(' + 'https://agoravaidoroy.s3.amazonaws.com/baby-blue-micro-fiber-cloth-fabric-texture.jpg' + ')' }" 
    id="app">
      <h1 id="titulo">RU</h1>
      <div id="op" style="margin-top: 2%;">
        <router-link style="margin-left: 3%;" to="/CadastrarRefeicao"><a>Cadastrar Refeicao</a></router-link>
        <router-link style="margin-left: 3%;" to="/cadastrar"><a>Cadastrar Comida</a> </router-link>
        <router-link style="margin-left: 3%;" to="/Graficos"><a>Graficos</a> </router-link>
        <router-link style="margin-left: 3%;" to="/"><a>Avaliacao</a> </router-link>
        <router-link style="margin-left: 3%;" to="/Login"><a>Login</a> </router-link>
      </div>
    </div>
    <router-view/>
  </div>
</template>
<script>
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
export default {
  
}
</script>

<style>
#titulo{
  float: left;
}
/* div #op router-link {
  margin-top: 2%;
} */
/* router-link{
    margin-left: 30%;
} */

/* #nav {
  padding: 30px;
  a {
    font-weight: bold;
    color: #2c3e50;
    &.router-link-exact-active {
      color: #42b983;
    }
  }
} */
</style>
