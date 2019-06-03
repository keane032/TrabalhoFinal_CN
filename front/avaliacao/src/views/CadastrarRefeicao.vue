<template>
<div>
    <h1>Cadastrar Cadapio</h1>
    <form>
     <div class="form-group">
        <label for="necessidade">Opcao 1</label>
        <select class="form-control" name="necessidade">
        <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
      
        </select>
    </div>
    <div class="form-group">
        <label for="necessidade">Opcao 2</label>
        <select class="form-control" name="necessidade">
        <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
      
        </select>
    </div>
    <div class="form-group">
        <label for="necessidade">Opcao 3</label>
        <select class="form-control" name="necessidade">
        <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
        </select>
    </div>
    <div class="form-group">
        <label for="necessidade">Opcao 4</label>
        <select class="form-control" name="necessidade">
         <option v-for="alimento of alimentos" v-bind:key="alimento.nomeAlimento">
            {{alimento.nomeAlimento}}</option>
        </select>
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
            alimentos:[],
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
<style>

</style>
