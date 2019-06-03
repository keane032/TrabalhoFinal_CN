<template>
  <div>
    <div>
      <h1>Vote nas opções</h1>
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
          <tr v-for="comida of comidas" v-bind:key="comida">
           
           <th scope="row">{{comida}}</th>
         
            <td>
                 <div>
                 <label><input type="radio" 
                 v-on:click="choice(comida,bom)"
                 v-bind:name=comida ></label>
               </div>
            </td>
            <td>
                <div>
                 <label><input type="radio" v-on:click="choice(comida,razoavel)" 
                 v-bind:name=comida ></label>
               </div>
            </td>
            <td>
               <div>
                 <label><input type="radio" v-on:click="choice(comida,ruim)" 
                 v-bind:name=comida></label>
               </div>
            </td>
  
          </tr>
        </tbody>
      </table>
   
    <button class="btn btn-primary">Salvar</button>
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
      comidas: ["Arroz", "Feijao", "Carne", "Frango", "Vegetariano"]

    };
  },
  created(){
      this.$axios.get("http://localhost:8081/alimentos/listar").then((response) => {
            console.log(response)
        })
  },
  methods: {
    salvar() {},
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
