import Vue from 'vue'
import App from './App.vue'
import router from './router'
import store from './store'
import './registerServiceWorker'
import BootstrapVue from 'bootstrap-vue'
import axios from 'axios'
import jsPDF from 'jspdf'
import 'chart.js'
import 'hchs-vue-charts'

Vue.use(window.VueCharts)
Vue.use(BootstrapVue)
Vue.use(jsPDF)

Vue.prototype.$axios = axios

Vue.config.productionTip = false

new Vue({
  router,
  store,
  render: function (h) { return h(App) }
}).$mount('#app')
