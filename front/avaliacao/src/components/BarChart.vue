<script>
import { Bar } from 'vue-chartjs'
export default {
    extends: Bar,
    
    data(){
      return {
        data:[],
        labelsNome:[],
        dataSetBom:[],
        dataSetRazoavel:[],
        dataSetRuim:[]

      }
    },

    mounted () {
        let _this = this
            this.$axios.get("http://54.87.6.194:8080/agoravai/alimentos/listar")
                .then(function(response) {
                    console.log(response.data);
                    _this.data = response.data;
                    _this.data.forEach(function(item){
                        _this.labelsNome.push(item.nomeAlimento),
                        _this.dataSetBom.push(item.avaliacaoBoa)
                        _this.dataSetRazoavel.push(item.avaliacaoRegular),
                        _this.dataSetRuim.push(item.avaliacaoRuim)

                              _this.renderChart({
                                    labels: _this.labelsNome,
                                    datasets: [
                                      {
                                        label: 'Ruim',
                                        backgroundColor: '#f10300',
                                        data: _this.dataSetRuim
                                      },
                                      {
                                        label: 'Medio',
                                        backgroundColor: '#f4ff1f',
                                        data: _this.dataSetRazoavel
                                      },
                                      {
                                        label: 'Bom',
                                        backgroundColor: '#13f100',
                                        data: _this.dataSetBom
                                      }
                                    ]
                                  })
                    });
                     console.log(_this.dataSetBom);
                });
        
  }
}
</script>
