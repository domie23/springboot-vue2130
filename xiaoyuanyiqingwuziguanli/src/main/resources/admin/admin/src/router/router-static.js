import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
    // 解决多次点击左侧菜单报错问题
    const VueRouterPush = VueRouter.prototype.push
    VueRouter.prototype.push = function push (to) {
    return VueRouterPush.call(this, to).catch(err => err)
    }
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
import beifen from '@/views/modules/databaseBackup/beifen'
import huanyuan from '@/views/modules/databaseBackup/huanyuan'

     import users from '@/views/modules/users/list'
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import gonggao from '@/views/modules/gonggao/list'
    import gongyingshang from '@/views/modules/gongyingshang/list'
    import wuzi from '@/views/modules/wuzi/list'
    import wuziChuruInout from '@/views/modules/wuziChuruInout/list'
    import wuziChuruInoutList from '@/views/modules/wuziChuruInoutList/list'
    import wuziOrder from '@/views/modules/wuziOrder/list'
    import wuzikucun from '@/views/modules/wuzikucun/list'
    import yonghu from '@/views/modules/yonghu/list'
    import config from '@/views/modules/config/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryGongyingshang from '@/views/modules/dictionaryGongyingshang/list'
    import dictionaryGongyingshangXinyongdengji from '@/views/modules/dictionaryGongyingshangXinyongdengji/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryWuzi from '@/views/modules/dictionaryWuzi/list'
    import dictionaryWuziChuruInout from '@/views/modules/dictionaryWuziChuruInout/list'
    import dictionaryWuziOrder from '@/views/modules/dictionaryWuziOrder/list'
    import dictionaryWuzikucun from '@/views/modules/dictionaryWuzikucun/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }, {
        path: '/huanyuan',
        name: '数据还原',
        component: huanyuan
    }, {
        path: '/beifen',
        name: '数据备份',
        component: beifen
    }, {
        path: '/users',
        name: '管理信息',
        component: users
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryGonggao',
        name: '公告类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryGongyingshang',
        name: '供应商类型',
        component: dictionaryGongyingshang
    }
    ,{
        path: '/dictionaryGongyingshangXinyongdengji',
        name: '供应商信用等级类型',
        component: dictionaryGongyingshangXinyongdengji
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryWuzi',
        name: '物资类型',
        component: dictionaryWuzi
    }
    ,{
        path: '/dictionaryWuziChuruInout',
        name: '出入库类型',
        component: dictionaryWuziChuruInout
    }
    ,{
        path: '/dictionaryWuziOrder',
        name: '订单类型',
        component: dictionaryWuziOrder
    }
    ,{
        path: '/dictionaryWuzikucun',
        name: '物资状态',
        component: dictionaryWuzikucun
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/gonggao',
        name: '公告',
        component: gonggao
      }
    ,{
        path: '/gongyingshang',
        name: '供应商信息',
        component: gongyingshang
      }
    ,{
        path: '/wuzi',
        name: '物资',
        component: wuzi
      }
    ,{
        path: '/wuziChuruInout',
        name: '出入库',
        component: wuziChuruInout
      }
    ,{
        path: '/wuziChuruInoutList',
        name: '出入库详情',
        component: wuziChuruInoutList
      }
    ,{
        path: '/wuziOrder',
        name: '物资分配',
        component: wuziOrder
      }
    ,{
        path: '/wuzikucun',
        name: '物资库存',
        component: wuzikucun
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
