<template>
    <div class="container row">
        <div class="col-7">
            <BarChart></BarChart>
        </div>
        <div class="col-4">
            <button v-on:click="gerarRelatorio()" class="btn btn-primary">Gerar Relatorio</button>
             <button style="margin-top:3%" v-on:click="excluir()" class="btn btn-primary">Excluir Refeicao</button>
        </div>
         
    </div>
</template>
<script>
import BarChart from '@/components/BarChart'
import jsPDF from 'jspdf'
import html2canvas from 'vue-html2canvas'
import 'jspdf-autotable';

export default {
    name:'graficos',
    components:{
        BarChart
    },
    data () {
      return {
          id:'',
          bodyvalue:[],
          cell:[]
      }
    },
    mounted(){
        let _this = this

      this.$axios.get("http://54.87.6.194:8080/agoravai/refeicao/listar").then((response) => {
            console.log(response.data[0].id)
           _this.id=response.data[0].id
           console.log(response)
        })

            this.$axios.get("http://54.87.6.194:8080/agoravai/alimentos/listar")
                .then(function(response) {
                    _this.data = response.data;
                    _this.data.forEach(function(item){
                        _this.cell.push(item.nomeAlimento),
                        _this.cell.push(item.avaliacaoBoa)
                        _this.cell.push(item.avaliacaoRegular),
                        _this.cell.push(item.avaliacaoRuim)
                        _this.bodyvalue.push(_this.cell)
                        _this.cell = []
                    });
                  
                });
    },
    methods:{
        excluir(){         
            let _this = this
      this.$axios.post("http://54.87.6.194:8080/agoravai/refeicao/excluir/"+_this.id).then((response) => {
            console.log(response)
            alert("refeicao excluida")
        })    
        },
        gerarRelatorio(){
            let _this = this
             const doc = new jsPDF();
            doc.text('Relatorio', 10, 10)
              console.log(_this.bodyvalue)
                    doc.autoTable({
                        head: [['Name', 'bom', 'medio','Ruim']],
                        body: _this.bodyvalue
                    });
                    doc.save('table.pdf');
        }
    }

}
</script>
<style>

</style>
