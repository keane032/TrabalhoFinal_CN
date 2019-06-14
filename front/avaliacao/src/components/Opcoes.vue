<template>
  <div>
    <div>
      <h1 style="margin-left: 37%;">Vote nas opções</h1>
      <h4 v-if="comidas.length == 0" style="margin-left:30%;color:red">Nao ha refeicoes cadastradas</h4>
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
           
           <th scope="row">{{comida.nomeAlimento}}</th>
            <td>
                 <div>
                 <label><input type="radio" 
                 v-on:click="choice(comida.nomeAlimento,bom)"
                 v-bind:name=comida.nomeAlimento ></label>
               </div>
            </td>
            <td>
                <div>
                 <label><input type="radio" v-on:click="choice(comida.nomeAlimento,razoavel)" 
                 v-bind:name=comida.nomeAlimento ></label>
               </div>
            </td>
            <td>
               <div>
                 <label><input type="radio" v-on:click="choice(comida.nomeAlimento,ruim)" 
                 v-bind:name=comida.nomeAlimento></label>
               </div>
            </td>
  
          </tr>
        </tbody>
      </table>
   
    <button v-if="comidas.length > 0" v-on:click="salvar()" style="margin-left:  55%;" class="btn btn-primary">Salvar</button>
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
      comidas: []

    };
  },
  created(){
      let _this = this
      this.$axios.get("http://localhost:8081/refeicao/listar").then((response) => {
            console.log(response.data[0].listaDeAlimentos)
           _this.comidas=response.data[0].listaDeAlimentos
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
