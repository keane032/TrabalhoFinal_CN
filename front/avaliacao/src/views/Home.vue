<template>
  <div class="home">
   <Opcoes/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import Opcoes from '@/components/Opcoes.vue'

export default {
  name: 'home',
  components: {
    HelloWorld,
    Opcoes
  }
}
</script>
