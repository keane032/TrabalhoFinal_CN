<template>
<div>
    <h1 style="margin-left:  35%;">Cadastrar Refeição</h1>
    <form style="border:1px solid #ccc" @submit.prevent="salvar" >
        <label for="nome">Nome: </label>
        <input required v-model="nome" type="text" class="form-control"><br/>
        <label for="nome">Descricao: </label><br/>
        <textarea required v-model="desc"/><br/>
        <button type="submit" class="btn btn-primary">Salvar</button>
    </form>
</div>    
</template>
<script>
export default {
    name:'Cadastro',
    data(){
        return {
            nome:'',
            desc:''
        }
    },
    methods:{
        salvar(){
        this.$axios.post("http://localhost:8081/alimentos/salvar", {
          nomeAlimento: this.nome,
          descricao: this.desc
        })
        .then(function(response) {
          console.log(response);
        });
              this.$router.go()
            }
    }
}
</script>
<style>
form{
  width: 30%;
  padding: 15px;
  margin-left:  35%;
}
</style>
