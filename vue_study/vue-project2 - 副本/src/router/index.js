import { createRouter, createWebHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AboutView from '../views/AboutView.vue'
import simple_directive from '../views/simple_directive.vue'
import user from '../views/user.vue'
import trans from '@/views/trans.vue'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'Home',
      component: HomeView
    },
    {
      path: '/about',
      name: 'about',
      component: AboutView
    },
    {
      path: '/test1',
      name: 'test1',
      component: simple_directive
    },
    {
      path: '/user/:username',
      name: 'User',
      component: user
    },
    {
      path: '/trans',
      name: 'Trans',
      component: trans
    }
  ]
})

export default router
