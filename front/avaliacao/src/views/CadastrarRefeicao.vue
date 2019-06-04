<template>
<div>
    <h1 style="margin-left:  37%;" >Cadastrar Cardapio</h1>
    <form>
      <div class="col-12">
        <label for="nome">Nome</label>
        <input type="text" class="form-control" name="nome" v-bind="nome"/> 
      </div>
    <div class="container row">
    <div class="col-6">
     <div class="form-group">
        <label for="necessidade">Opcao 1</label>
        <select class="form-control" name="necessidade">
        <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
      
        </select>
    </div>
    </div>
   <div class="col-6"> 
    <div class="form-group">
        <label for="necessidade">Opcao 2</label>
        <select class="form-control" name="necessidade">
        <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
      
        </select>
    </div>
   </div>
   <div class="col-6">
    <div class="form-group">
        <label for="necessidade">Opcao 3</label>
        <select class="form-control" name="necessidade">
        <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
        </select>
    </div>
   </div>
   <div class="col-6">
    <div class="form-group">
        <label for="necessidade">Opcao 4</label>
        <select class="form-control" name="necessidade">
         <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
        </select>
    </div>
   </div>
   <div class="col-6">
     <div class="form-group">
        <label for="necessidade">Opcao 5</label>
        <select class="form-control" name="necessidade">
         <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
        </select>
    </div>
   </div>
   <div class="col-6">
     <div class="form-group">
        <label for="necessidade">Opcao 6</label>
        <select class="form-control" name="necessidade">
         <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
        </select>
    </div>
   </div>
   <div class="col-12">
     <div class="form-group">
        <label for="necessidade">Opcao 7</label>
        <select class="form-control" name="necessidade">
         <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
        </select>
    </div>
   </div>
    </div>
        <button class="btn btn-primary">Salvar</button>
    </form>
</div>
</template>
<script>
export default {
    name:'cadastrarRefeicao',
    data (){
        return {
            nome:'',
            alimentos:[],
            refeicao:{
                nomeRefeicao:'',
                ListaDeAlimentos:[]
            },            
        }
    },
    created(){
            let _this = this
            this.$axios.get("http://localhost:8081/alimentos/listar",)
                .then(function(response) {
                    console.log(response.data);
                    _this.alimentos = response.data;
                });
    }

}
</script>
<style scoped>
form{
    margin-left: 25%;
    width: 50%;
}
</style>
