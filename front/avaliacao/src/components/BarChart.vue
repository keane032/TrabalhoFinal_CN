
<script>
import { Bar } from 'vue-chartjs'
export default {
    extends: Bar,
    
    mounted () {
        let _this = this
        this.renderChart({
      labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
      datasets: [
        {
          label: 'Ruim',
          backgroundColor: '#f10300',
          data: [40, 20, 12, 39, 10, 40, 39, 80, 40, 20, 12, 11]
        },
         {
          label: 'Medio',
          backgroundColor: '#f4ff1f',
          data: [30, 20, 7, 33, 10, 40, 22, 60, 40, 20, 12, 11]
        },
        {
          label: 'Bom',
          backgroundColor: '#13f100',
          data: [30, 20, 12, 39, 15, 40, 39, 70, 40, 20, 12, 11]
        }
      ]
    })
  }
}
</script>
