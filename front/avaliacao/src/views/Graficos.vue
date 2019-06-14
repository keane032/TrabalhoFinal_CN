<template>
    <div class="container row">
        <div class="col-7">
            <BarChart></BarChart>
        </div>
        <div class="col-4">
            <chartjs-bar></chartjs-bar>
            <chartjs-line></chartjs-line>
            <button class="btn btn-primary">Gerar Relatorio</button>
        </div>
         
    </div>
</template>
<script>
import BarChart from '@/components/BarChart'
export default {
    name:'graficos',
    components:{
        BarChart
    },
    data () {
      return {
        labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
        dataset: [
            [65, 59, 80, 81, 56, 55, 40],
            [65, 59, 80, 81, 56, 55, 40]
        ],
      }
    }
}
</script>
<style>

</style>
