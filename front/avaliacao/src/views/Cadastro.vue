<template>
<div>
    <form style="border:1px solid #ccc">
        <label for="nome">Nome: </label>
        <input type="text" class="form-control" name="nome"><br/>
        <button type="submit" class="btn btn-primary">Salvar</button>
    </form>
</div>    
</template>
<script>
export default {
    name:'Cadastro',
    data(){
        return {
            nome:''
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
