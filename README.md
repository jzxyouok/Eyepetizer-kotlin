
# Eyepetizer
    主要是为了通过仿写APP更好的学习kotlin(选择该APP原因主要是因为有大佬已经写过了，站在巨人的肩膀站得高看的远)

# 计划
    主页，每日精选页面（莫名的觉得爬的都是一样的，难道因为我用了和大佬不一样的API）
    主页（今天爬的时候莫名的发现多了个返回type==banner2的）
    播放页面
    发现页面
    关注页面

# 目前进度 

## 启动页面
    开机启动慢慢变亮

## 首页
    显示每日精选(viewpager)
    显示每日推荐（recyclerView）
    实现每日精选文字逐字显示（照搬大佬的轮子，后期有想法再优化）
    实现下拉放大图片刷新（照搬大佬的自定义轮子）
    实现文字动画效果(照搬大佬的自定义轮子)
## 播放页面
    (参考了大佬的代码，不一定是优化了，反正是简化了。。。)
    实现点击全屏和选择全屏播放
    实现显示作品相关信息(暂未能实现查看评论功能)
    实现相关视频推荐(recyclerView)
## TODO
    考虑使用一个其他的播放器替代首页的的轮播。
## bug
    打开首页会占用音频播放导致音乐播放器停止工作
## 其他页面
    暂时在未出现。。。
   

# 实现方式
    TabLayout+Fragment 实现底部导航栏(这个感觉还是比较简单的，网上抄了就懂了)
    okhttp+retrofit+rxjava 实现网络请求框架（一脸懵逼，表示目前还处于拿来能用的阶段,虽然百度上都说这套连招比较好，然而不知道为什么）
    mvp 框架（不明觉厉的框架）
    
# 关于我
    联系：497533265@qq.com    
## 声明
    Api 数据都是来自开眼视频，数据接口均属于非正常渠道获取，请勿用于商业用途，原作公司拥有所有权利。
    
## 参考
    https://github.com/kaikaixue/Eyepetizer
    https://github.com/LRH1993/Eyepetizer-in-Kotlin
    感谢大佬们的资源，向大佬们学习。
