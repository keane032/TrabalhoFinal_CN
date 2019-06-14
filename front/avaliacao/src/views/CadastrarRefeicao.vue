<template>
<div>
    <h1 style="margin-left:  37%;" >Cadastrar Cardapio</h1>
    <form>
      <div class="col-12">
        <label for="nome">Nome</label>
        <input type="text" class="form-control" name="nome" v-model="nomeRefeicao"/> 
      </div>
    <div class="container row">
        <h4 v-if="alimentos.length == 0" style="color:red">Nao ha comida cadastrada</h4>
    <ul v-if="alimentos.length > 0">
        <div class="col 6">
            <li v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
                <input type="checkbox" v-model="ListaDeAlimentos"
                v-bind:id="alimento.id"
                v-bind:value="alimento"
                > {{alimento.nomeAlimento}}<br>
            </li>
        </div>
    </ul>
    </div>
      
    </form>
      <button v-on:click="salvar" style="margin-left: 30%" class="btn btn-primary">Salvar</button>
</div>
</template>
<script>
import Alimento from '../model/Alimento'
export default {
    name:'cadastrarRefeicao',
    data (){
        return {
            alimentos:[],
            nomeRefeicao:'',
            ListaDeAlimentos:[],            
        }
    },
    created(){
            let _this = this
            this.$axios.get("http://localhost:8081/alimentos/listar")
                .then(function(response) {
                    console.log(response.data);
                    _this.alimentos = response.data;
                });
    },
    methods:{
        salvar(){

            console.log(JSON.stringify(this.ListaDeAlimentos))

            this.$axios.post("http://localhost:8081/refeicao/salvar",
                {
                   nomeRefeicao:this.nomeRefeicao,
                   listaDeAlimentos:this.ListaDeAlimentos
                }
                
                ).then(function(response) {
                    console.log(response)
                });
                 this.$router.push('/') 
        }
    }

}
</script>
<style scoped>
form{
    margin-left: 25%;
    width: 50%;
}
</style>
