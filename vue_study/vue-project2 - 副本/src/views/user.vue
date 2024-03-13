<template>
    <div>
        {{ user }}
    </div>
</template>
<script>
export default{
    data(){
        return {
            user:this.$route.params.username
        }
    }
}
</script>