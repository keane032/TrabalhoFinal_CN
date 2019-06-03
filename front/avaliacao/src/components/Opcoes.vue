<template>
  <div>
    <div>
      <h1 style="margin-left: 37%;">Vote nas opções</h1>
    </div>
  
      <table class="table table-hover" align="center">
        <thead>
          <tr>
            <th scope="col" style="background:blue">Comida</th>
            <th scope="col" style="background:green">Bom</th>
            <th scope="col" style="background:yellow">Razoável</th>
            <th scope="col" style="background:red">Ruim</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="comida of comidas" v-bind:key="comida.nome">
           
           <th scope="row">{{comida.nome}}</th>
         
            <td>
                 <div>
                 <label><input type="radio" 
                 v-on:click="choice(comida.nome,bom)"
                 v-bind:name=comida.nome ></label>
               </div>
            </td>
            <td>
                <div>
                 <label><input type="radio" v-on:click="choice(comida.nome,razoavel)" 
                 v-bind:name=comida.nome ></label>
               </div>
            </td>
            <td>
               <div>
                 <label><input type="radio" v-on:click="choice(comida.nome,ruim)" 
                 v-bind:name=comida.nome></label>
               </div>
            </td>
  
          </tr>
        </tbody>
      </table>
   
    <button v-on:click="salvar()" style="margin-left:  55%;" class="btn btn-primary">Salvar</button>
  </div>
</template>
<script>

export default {
  name: "Opocoes",
  data() {
    return {
      bom:"Bom",
      razoavel:"razoavel",
      ruim:"ruim",
      comidas: [{nome:"Arroz",avaliacao:""}, {nome:"Feijao",avaliacao:""}
      , {nome:"Carne",avaliacao:""},{nome:"Frango",avaliacao:""}, 
      {nome:"Vegetariano",avaliacao:""}]

    };
  },
  created(){
      this.$axios.get("http://localhost:8081/alimentos/listar").then((response) => {
            console.log(response)
        })
  },
  methods: {
    salvar() {
       console.log(this.comidas)
    },
    choice(comida,status) {
      console.log(comida)
      console.log(status)
    }
  }
};

</script>
<style scoped>

.table{
	width:60px;
	height:60px;
	padding:20px;
}

td{
  width:40px;
	height:40px;
	padding:10px;
	border:1px solid black;
}

th{
  width:40px;
	height:40px;
	padding:10px;
	border:1px solid black;
}

</style>
