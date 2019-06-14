<template>
    <div>
    <form>
        <label for="nome">Nome</label>
        <input type="text" class="form-control" name="nome" v-model="login"/> 
        <label for="password">Senha</label>
        <input type="password" class="form-control" name="password" v-model="password"/> 
        <div id="buttons" style="margin-top:3%">
          <button class="btn btn-primary">Logar</button>
         <button class="btn">Cadastrar</button>
        </div>
    </form>
    </div>
</template>
<script>
export default {
    name:'login',
    data(){
        return{
            login:'',
            password:''
        }
    }
}
</script>
<style scoped>
form{
    margin-top: 9%;
    margin-left: 37%;
    width: 30%;
    border-color: black;
    border-width: 15%;
}
</style>

