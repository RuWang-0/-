# 复旦校园二手交易平台

http://47.101.152.118:8080/ 

### 需求分析
	在信息化快速发展的5G时代，互联网行业欣欣向荣，普罗大众包括大学生对于网上交易的接受程度和对于网上交易信息的需求日益增长，大学生群体对于共享经济的概念也已经十分熟悉。作为资源再利用的重要手段，二手交易也逐步从小范围点对点试的熟人之间的交易扩展为同校、同城的大范围网络式交易。作为大学生，在校生活需要使用到校园二手交易信息通过互联网广泛传播。依照同学们的日常经验，现有的二手商品交易主要通过微信群进行，不仅缺少标准的商品发布、交易流程支持，也不利于信息的实时更新和而针对PC端二手交易的信息发布平台则未有被广泛使用的先例。因此，我们小组决定

### 设计目标
	本次sprint需要实现一个复旦大学二手交易平台，用户作为买家可以在平台上检索二手商品信息与卖家联系，也可以发布商品求购信息，撤销求购信息；作为卖家可以发布商品、商品信息，修改商品信息，撤下商品，或者通过求购信息与买家联系。商品支持关键字模糊查询、分类搜索。求购商品与发布商品的界面同时需要支持留言功能。需要进一步的开发功能包括后台管理商品结算、下架，卖家买家相互评价，商品收藏评论等。需要进一步添加的成员是管理员，负责商品下架管理（暂时由卖家进行管理）。


### 平台首页

#### 前端设计

- logo 
- 搜索引擎 
- 注册登录 / 用户模块
- 首页跳转 二手商城跳转 求购商城跳转
- 轮播图展示商品
- 最新商品展示最新发布的5个商品

![屏幕快照 2020-11-26 下午11.50.12](../../../Desktop/pics/屏幕快照 2020-11-26 下午11.50.12.png)

![屏幕快照 2020-11-26 上午10.37.50](../../../Desktop/pics/屏幕快照 2020-11-26 上午10.37.50.png)



![屏幕快照 2020-11-27 上午1.18.25](README.assets/屏幕快照 2020-11-27 上午1.18.25.png)

- 用户界面
  - 个人信息
  - 发布商品
  - 发布求购信息
  - 购物车
  - 我发布的商品
  - 我求购的商品
  - 退出登陆
  - 我收藏的商品（未实现）
  - 我的交易（未实现）
  - 	交易历史
  - 	订单
  - 我的消息（未实现）
  - 	卖家留言
  - 	买家留言
  - 我的评分（未实现）
  - 	星级卖家
  - 	星级买家

![屏幕快照 2020-11-27 上午1.44.33](README.assets/屏幕快照 2020-11-27 上午1.44.33.png)

### 登录注册模块

- 登录模块： 手机号和密码登录
  - 暂未实现动态验证
- 注册模块： 用户名、手机号码、密码、确认密码
  - 用户名支持
  - 手机号检验位数
  - 暂未实现动态验证

![屏幕快照 2020-11-27 上午1.48.51](README.assets/屏幕快照 2020-11-27 上午1.48.51-6412975.png)

![屏幕快照 2020-11-27 上午12.36.01](../../../Desktop/pics/屏幕快照 2020-11-27 上午1.48.51.png)

### 二手商城

#### 前端设计

- 分类搜索模块
- 	侧边栏支持分类搜索，点击每个类别显示三级分类的最小子类商品。

![屏幕快照 2020-11-27 上午1.53.37](README.assets/屏幕快照 2020-11-27 上午1.53.37.png)

- 商品展示模块 显示商品图片和商品名称，点击需要显示具体信息。

![屏幕快照 2020-11-27 上午1.53.45](README.assets/屏幕快照 2020-11-27 上午1.53.45.png)

### 商品详情

- 商品详情页面未实现
- 通过商品给卖家留言功能暂未实现
- 商品收藏未实现
- 商品评论未实现
- 暂时背景显示
- ![屏幕快照 2020-11-27 上午1.56.33](README.assets/屏幕快照 2020-11-27 上午1.56.33.png)

### 站内搜索引擎

- 关键词搜索
![屏幕快照 2020-11-27 上午1.58.47](README.assets/屏幕快照 2020-11-27 上午1.58.47.png)

- 支持模糊查询
![屏幕快照 2020-11-27 上午2.01.21](README.assets/屏幕快照 2020-11-27 上午2.01.21.png)

### 发布商品

- 发布商品需要提供商品名、成色、单价、数量、联系方式
- 支持三级分类
- 上传图片
- 发布商品详情需要过滤敏感词未实现

![屏幕快照 2020-11-27 上午2.07.19](README.assets/屏幕快照 2020-11-27 上午2.07.19.png)

![屏幕快照 2020-11-27 上午2.07.26](README.assets/屏幕快照 2020-11-27 上午2.07.26.png)

### 发布求购信息

- 发布求购信息需要上传商品名、数量、单价、详情、分类。

![屏幕快照 2020-11-27 上午2.56.18](README.assets/屏幕快照 2020-11-27 上午2.56.18.png)

### 个人信息页面

- 学生个人信息需要包括用户名、真实姓名、性别、学号、宿舍号、Email和修改功能

![屏幕快照 2020-11-27 上午2.30.18](README.assets/屏幕快照 2020-11-27 上午2.30.18.png)

### 我发布的商品
 - 支持修改信息
 - 支持删除信息
 - 支持查看留言（未实现）

 ![屏幕快照 2020-11-27 上午2.45.35](README.assets/屏幕快照 2020-11-27 上午2.45.35.png)
 

### 购物车实现

- 支持显示商品信息包括图片和文字，商品金额，商品数量，总金额
- 支持删除增加商品数量，选择结算
- 结算交易流程未实现

![屏幕快照 2020-11-27 上午3.06.42](README.assets/屏幕快照 2020-11-27 上午3.06.42.png) 


### 数据库与数据字典
一、考虑到校内信息量少，使用关系型数据库mysql便于管理。在服务器中使用docker搭建mysql服务，并修改原版本mysql配置文件使其支持utf8（简体中文）。

二、在数据库中按照如下的数据字典建表：

1、商品一级分类

| 字段名        | 字段类型    | 约束                     | 备注         |
| ------------- | ----------- | ------------------------ | ------------ |
| First_id      | int(11)     | 主键，不可为空，自动递增 | 一级分类编号 |
| name          | varchar(50) | 不可为空                 | 一级分类名   |
| modified_time | datetime    | 默认为空                 | 修改时间     |



2、商品二级分类

| 字段名        | 字段类型    | 约束                     | 备注               |
| ------------- | ----------- | ------------------------ | ------------------ |
| Second_id     | int(11)     | 主键，不可为空，自动递增 | 二级分类编号       |
| name          | varchar(50) | 不可为空                 | 二级分类名         |
| modified_time | datetime    | 默认为空                 | 修改时间           |
| First_id      | int(11)     | 不可为空                 | 从属的一级分类编号 |



3、商品三级分类

| 字段名        | 字段类型    | 约束                     | 备注               |
| ------------- | ----------- | ------------------------ | ------------------ |
| Third_id      | int(11)     | 主键，不可为空，自动递增 | 三级分类编号       |
| name          | varchar(50) | 不可为空                 | 三级分类名         |
| modified_time | datetime    | 默认为空                 | 修改时间           |
| Second_id     | int(11)     | 不可为空                 | 从属的二级分类编号 |



4、用户信息

| 字段名        | 字段类型    | 约束                     | 备注         |
| ------------- | ----------- | ------------------------ | ------------ |
| uid           | Int(11)     | 主键，不可为空，自动递增 | 用户编号     |
| modified_time | Datetime    | 默认为空                 | 修改时间     |
| username      | Varchar(50) | 不可为空                 | 用户名       |
| phone         | Char(11)    | 唯一索引，不可为空       | 注册手机号码 |
| realname      | Varchar(20) | 默认为空                 | 真实姓名     |
| student_id    | Char(12)    | 默认为空                 | 学号         |
| dormitory     | Varchar(20) | 默认为空                 | 宿舍号       |
| gender        | Char（2）   | 默认为空，只有“男”或“女” | 性别         |
| createtime    | Datetime    | 默认为空                 | 创建时间     |



5、用户密码

| 字段名        | 字段类型    | 约束                     | 备注              |
| ------------- | ----------- | ------------------------ | ----------------- |
| password_id   | Int(11)     | 主键，不可为空，自动递增 | 密码编号          |
| modified_time | datetime    | 默认为空                 | 修改时间          |
| password      | Varchar(24) | 不可为空                 | 密码（MD5加密后） |
| uid           | Int(11)     | 不可为空                 | 对应用户id        |



6、商品信息表

| 字段名        | 字段类型      | 约束                     | 备注           |
| ------------- | ------------- | ------------------------ | -------------- |
| good_id       | Int(11)       | 主键，不可为空，自动递增 | 商品编号       |
| modified_time | datetime      | 默认为空                 | 修改时间       |
| name          | Varchar(50)   | 不可为空                 | 商品名称       |
| level         | Int(11)       | 不可为空                 | 几成新         |
| remark        | Varchar(255)  | 不可为空                 | 详情           |
| price         | Decimal(0.00) | 不可为空                 | 商品价格       |
| Third_id      | Int(11)       | 不可为空                 | 从属第三级分类 |
| quantity      | Int           | 不可为空                 | 数量           |
| display       | bool          | 不可为空，默认为true     | 是否展示       |
| sales         | Int           | 不可为空，默认为0        | 已销售数量     |
| uid           | Int           | 不可为空                 | 发表的用户id   |
| Image         | Varchar(255)  | 默认为空                 | 商品的图片地址 |



7、购物车

| 字段名        | 字段类型 | 约束                     | 备注               |
| ------------- | -------- | ------------------------ | ------------------ |
| cid           | Int(11)  | 主键，不可为空，自动递增 | 购物车编号         |
| modified_time | datetime | 默认为空                 | 修改时间           |
| display       | bool     | 不可为空，默认为true     | 是否保留在购物车中 |
| uid           | Int(11)  | 不可为空                 | 对应用户id         |
| good_id       | Int(11)  | 不可为空                 | 对应商品id         |
| quantity      | Int(11)  | 不可为空                 | 购买数量           |



8、发布的商品信息

| 字段名        | 字段类型 | 约束                     | 备注             |
| ------------- | -------- | ------------------------ | ---------------- |
| sid           | Int(11)  | 主键，不可为空，自动递增 | 发布商品信息编号 |
| modified_time | datetime | 默认为空                 | 修改时间         |
| display       | bool     | 不可为空，默认为true     | 是否展示         |
| uid           | Int(11)  | 不可为空                 | 用户id           |
| good_id       | Int(11)  | 不可为空                 | 对应商品id       |



9、发布的求购信息

| 字段名        | 字段类型      | 约束                     | 备注             |
| ------------- | ------------- | ------------------------ | ---------------- |
| wid           | Int(11)       | 主键，不可为空，自动递增 | 求购商品信息编号 |
| modified_time | datetime      | 默认为空                 | 修改时间         |
| display       | bool          | 不可为空，默认为真       | 是否展示         |
| name          | varchar(50)   | 不可为空                 | 求购商品名称     |
| Third_id      | id int(11)    | 不可为空                 | 从属的第三级分类 |
| quantity      | int(11)       | 不可为空                 | 求购数量         |
| price         | decimal(10,2) | 不可为空                 | 价格             |
| remark        | varchar(255)  | 默认为空                 | 求购详情         |
| uid           | Int(11)       | 不可为空                 | 用户id           |



三、数据库中的默认信息：

​	数据库中的各表，三级分类中预置了相关分类信息，其他表在初始时均为空表，可在网页上进行相应操作完成对各表的修改。

1、第一级分类

属性：First_id 一级分类编号，name 一级分类名，  modified_time 修改时间

```mysql
INSERT INTO `FirstClass` VALUES ('1', '数码电器', '2020-10-20 00:00:00');
INSERT INTO `FirstClass` VALUES ('2', '个人护理', '2020-10-20 00:00:00');
INSERT INTO `FirstClass` VALUES ('3', '生活家居', '2020-10-20 00:00:00');
INSERT INTO `FirstClass` VALUES ('4', '服饰箱包', '2020-10-20 00:00:00');
INSERT INTO `FirstClass` VALUES ('5', '教育', '2020-10-20 00:00:00');
INSERT INTO `FirstClass` VALUES ('6', '食品医药', '2020-10-20 00:00:00');
INSERT INTO `FirstClass` VALUES ('7', '其他', '2020-10-20 00:00:00');
```



2、第二级分类

属性：Second_id 二级分类编号，name 二级分类名，modified_time 修改时间，First_id 从属的一级分类编号

```mysql
INSERT INTO `SecondClass` VALUES ('1', '手机', null, '1');
INSERT INTO `SecondClass` VALUES ('2', '电脑', null, '1');
INSERT INTO `SecondClass` VALUES ('3', '摄影摄像', null, '1');
INSERT INTO `SecondClass` VALUES ('4', '电器', null, '1');
INSERT INTO `SecondClass` VALUES ('5', '其他', null, '1');
INSERT INTO `SecondClass` VALUES ('6', '护肤品', null, '2');
INSERT INTO `SecondClass` VALUES ('7', '彩妆', null, '2');
INSERT INTO `SecondClass` VALUES ('8', '清洁卫生', null, '2');
INSERT INTO `SecondClass` VALUES ('9', '其他', null, '2');
INSERT INTO `SecondClass` VALUES ('10', '床上用品', null, '3');
INSERT INTO `SecondClass` VALUES ('11', '花卉绿植', null, '3');
INSERT INTO `SecondClass` VALUES ('12', '布艺家饰', null, '3');
INSERT INTO `SecondClass` VALUES ('13', '收纳清洁', null, '3');
INSERT INTO `SecondClass` VALUES ('14', '其他', null, '3');
INSERT INTO `SecondClass` VALUES ('15', '男装', null, '4');
INSERT INTO `SecondClass` VALUES ('16', '女装', null, '4');
INSERT INTO `SecondClass` VALUES ('17', '配饰', null, '4');
INSERT INTO `SecondClass` VALUES ('18', '箱包', null, '4');
INSERT INTO `SecondClass` VALUES ('19', '其他', null, '4');
INSERT INTO `SecondClass` VALUES ('20', '图书', null, '5');
INSERT INTO `SecondClass` VALUES ('21', '文具', null, '5');
INSERT INTO `SecondClass` VALUES ('22', '艺术', null, '5');
INSERT INTO `SecondClass` VALUES ('23', '其他', null, '5');
INSERT INTO `SecondClass` VALUES ('24', '食品', null, '6');
INSERT INTO `SecondClass` VALUES ('25', '保健品', null, '6');
INSERT INTO `SecondClass` VALUES ('26', '医药用品', null, '6');
INSERT INTO `SecondClass` VALUES ('27', '其他', null, '6');
INSERT INTO `SecondClass` VALUES ('28', '其他', null, '7');
```



3、第三级分类

属性：Third_id 二级分类编号，name 二级分类名，modified_time 修改时间，Second_id 从属的二级分类编号

```mysql
INSERT INTO `ThirdClass` VALUES ('1', '整机', null, '1');
INSERT INTO `ThirdClass` VALUES ('2', '保护膜', null, '1');
INSERT INTO `ThirdClass` VALUES ('3', '手机壳', null, '1');
INSERT INTO `ThirdClass` VALUES ('4', '其他', null, '1');
INSERT INTO `ThirdClass` VALUES ('5', '笔记本', null, '2');
INSERT INTO `ThirdClass` VALUES ('6', '台式机', null, '2');
INSERT INTO `ThirdClass` VALUES ('7', '平板', null, '2');
INSERT INTO `ThirdClass` VALUES ('8', '鼠标键盘', null, '2');
INSERT INTO `ThirdClass` VALUES ('9', '显示器', null, '2');
INSERT INTO `ThirdClass` VALUES ('10', '主机', null, '2');
INSERT INTO `ThirdClass` VALUES ('11', '网络产品', null, '2');
INSERT INTO `ThirdClass` VALUES ('12', '其他', null, '2');
INSERT INTO `ThirdClass` VALUES ('13', '相机', null, '3');
INSERT INTO `ThirdClass` VALUES ('14', '镜头', null, '3');
INSERT INTO `ThirdClass` VALUES ('15', '摄影器材', null, '3');
INSERT INTO `ThirdClass` VALUES ('16', '其他', null, '3');
INSERT INTO `ThirdClass` VALUES ('17', '洗衣机', null, '4');
INSERT INTO `ThirdClass` VALUES ('18', '饮水机', null, '4');
INSERT INTO `ThirdClass` VALUES ('19', '电吹风', null, '4');
INSERT INTO `ThirdClass` VALUES ('20', '风扇', null, '4');
INSERT INTO `ThirdClass` VALUES ('21', '空调', null, '4');
INSERT INTO `ThirdClass` VALUES ('22', '其他', null, '4');
INSERT INTO `ThirdClass` VALUES ('23', '耳机', null, '5');
INSERT INTO `ThirdClass` VALUES ('24', '收音机', null, '5');
INSERT INTO `ThirdClass` VALUES ('25', '无人机', null, '5');
INSERT INTO `ThirdClass` VALUES ('26', '其他', null, '5');
INSERT INTO `ThirdClass` VALUES ('27', '补水', null, '6');
INSERT INTO `ThirdClass` VALUES ('28', '保湿', null, '6');
INSERT INTO `ThirdClass` VALUES ('29', '祛痘去角质', null, '6');
INSERT INTO `ThirdClass` VALUES ('30', '其他', null, '6');
INSERT INTO `ThirdClass` VALUES ('31', '美容', null, '7');
INSERT INTO `ThirdClass` VALUES ('32', '美发', null, '7');
INSERT INTO `ThirdClass` VALUES ('33', '美甲', null, '7');
INSERT INTO `ThirdClass` VALUES ('34', '其他', null, '7');
INSERT INTO `ThirdClass` VALUES ('35', '洗发护发', null, '8');
INSERT INTO `ThirdClass` VALUES ('36', '沐浴用品', null, '8');
INSERT INTO `ThirdClass` VALUES ('37', '口腔清洁', null, '8');
INSERT INTO `ThirdClass` VALUES ('38', '其他', null, '8');
INSERT INTO `ThirdClass` VALUES ('39', '其他', null, '9');
INSERT INTO `ThirdClass` VALUES ('40', '蚊帐', null, '10');
INSERT INTO `ThirdClass` VALUES ('41', '眼罩耳塞', null, '10');
INSERT INTO `ThirdClass` VALUES ('42', '床头灯', null, '10');
INSERT INTO `ThirdClass` VALUES ('43', '其他', null, '10');
INSERT INTO `ThirdClass` VALUES ('44', '盆栽盆景', null, '11');
INSERT INTO `ThirdClass` VALUES ('45', '多肉植物', null, '11');
INSERT INTO `ThirdClass` VALUES ('46', '水培植物', null, '11');
INSERT INTO `ThirdClass` VALUES ('47', '园艺工具', null, '11');
INSERT INTO `ThirdClass` VALUES ('48', '其他', null, '11');
INSERT INTO `ThirdClass` VALUES ('49', '窗帘', null, '12');
INSERT INTO `ThirdClass` VALUES ('50', '靠垫坐垫', null, '12');
INSERT INTO `ThirdClass` VALUES ('51', '抱枕', null, '12');
INSERT INTO `ThirdClass` VALUES ('52', '墙纸', null, '12');
INSERT INTO `ThirdClass` VALUES ('53', '摆件装饰', null, '12');
INSERT INTO `ThirdClass` VALUES ('54', '闹钟', null, '12');
INSERT INTO `ThirdClass` VALUES ('55', '其他', null, '12');
INSERT INTO `ThirdClass` VALUES ('56', '衣架', null, '13');
INSERT INTO `ThirdClass` VALUES ('57', '收纳盒&收纳袋', null, '13');
INSERT INTO `ThirdClass` VALUES ('58', '垃圾桶&垃圾袋', null, '13');
INSERT INTO `ThirdClass` VALUES ('59', '防尘', null, '13');
INSERT INTO `ThirdClass` VALUES ('60', '扫帚拖把', null, '13');
INSERT INTO `ThirdClass` VALUES ('61', '除湿防潮', null, '13');
INSERT INTO `ThirdClass` VALUES ('62', '除菌防虫', null, '13');
INSERT INTO `ThirdClass` VALUES ('63', '其他', null, '13');
INSERT INTO `ThirdClass` VALUES ('64', '其他', null, '14');
INSERT INTO `ThirdClass` VALUES ('65', '上装', null, '15');
INSERT INTO `ThirdClass` VALUES ('66', '下装', null, '15');
INSERT INTO `ThirdClass` VALUES ('67', '鞋帽', null, '15');
INSERT INTO `ThirdClass` VALUES ('68', '假发', null, '15');
INSERT INTO `ThirdClass` VALUES ('69', '其他', null, '15');
INSERT INTO `ThirdClass` VALUES ('70', '上装', null, '16');
INSERT INTO `ThirdClass` VALUES ('71', '下装', null, '16');
INSERT INTO `ThirdClass` VALUES ('72', '鞋帽', null, '16');
INSERT INTO `ThirdClass` VALUES ('73', '假发', null, '16');
INSERT INTO `ThirdClass` VALUES ('74', '其他', null, '16');
INSERT INTO `ThirdClass` VALUES ('75', '手表', null, '17');
INSERT INTO `ThirdClass` VALUES ('76', '耳环', null, '17');
INSERT INTO `ThirdClass` VALUES ('77', '手链项链', null, '17');
INSERT INTO `ThirdClass` VALUES ('78', '其他', null, '17');
INSERT INTO `ThirdClass` VALUES ('79', '男包', null, '18');
INSERT INTO `ThirdClass` VALUES ('80', '女包', null, '18');
INSERT INTO `ThirdClass` VALUES ('81', '背包', null, '18');
INSERT INTO `ThirdClass` VALUES ('82', '手提', null, '18');
INSERT INTO `ThirdClass` VALUES ('83', '行李箱', null, '18');
INSERT INTO `ThirdClass` VALUES ('84', '其他', null, '18');
INSERT INTO `ThirdClass` VALUES ('85', '其他', null, '19');
INSERT INTO `ThirdClass` VALUES ('86', '教材教辅', null, '20');
INSERT INTO `ThirdClass` VALUES ('87', '考试资料', null, '20');
INSERT INTO `ThirdClass` VALUES ('88', '畅销文学', null, '20');
INSERT INTO `ThirdClass` VALUES ('89', '期刊杂志', null, '20');
INSERT INTO `ThirdClass` VALUES ('90', '其他', null, '20');
INSERT INTO `ThirdClass` VALUES ('91', '笔', null, '21');
INSERT INTO `ThirdClass` VALUES ('92', '墨', null, '21');
INSERT INTO `ThirdClass` VALUES ('93', '纸', null, '21');
INSERT INTO `ThirdClass` VALUES ('94', '其他', null, '21');
INSERT INTO `ThirdClass` VALUES ('95', '乐器', null, '22');
INSERT INTO `ThirdClass` VALUES ('96', '绘画工具', null, '22');
INSERT INTO `ThirdClass` VALUES ('97', '其他', null, '22');
INSERT INTO `ThirdClass` VALUES ('98', '其他', null, '23');
INSERT INTO `ThirdClass` VALUES ('99', '零食', null, '24');
INSERT INTO `ThirdClass` VALUES ('100', '茶酒', null, '24');
INSERT INTO `ThirdClass` VALUES ('101', '乳品冲饮', null, '24');
INSERT INTO `ThirdClass` VALUES ('102', '水果', null, '24');
INSERT INTO `ThirdClass` VALUES ('103', '其他', null, '24');
INSERT INTO `ThirdClass` VALUES ('104', '维生素', null, '25');
INSERT INTO `ThirdClass` VALUES ('105', '安神助眠', null, '25');
INSERT INTO `ThirdClass` VALUES ('106', '缓解疲劳', null, '25');
INSERT INTO `ThirdClass` VALUES ('107', '提神醒脑', null, '25');
INSERT INTO `ThirdClass` VALUES ('108', '其他', null, '25');
INSERT INTO `ThirdClass` VALUES ('109', '伤口包扎', null, '26');
INSERT INTO `ThirdClass` VALUES ('110', '常备药物', null, '26');
INSERT INTO `ThirdClass` VALUES ('111', '其他', null, '26');
INSERT INTO `ThirdClass` VALUES ('112', '其他', null, '27');
INSERT INTO `ThirdClass` VALUES ('113', '其他', null, '28');
```


# 一、设计概要
　　本次设计的是一个校园二手交易平台（C2C），C2C指个人与个人之间的电子商务，买家可以查看所有卖家发布的商品，并且根据分类进行商品过滤，也可以根据站内搜索引擎进行商品的查询，并且与卖家联系，达成交易的意向，也可以发布求购的信息，让卖家查看之后，与之联系，进行交易。而此次主要是针对校园用户所设计的网站，对于数据的分类应该更多的考虑校园用户的需求，例如二手书籍、二手数码等的分类应该更加细致。本次设计的主要难度在于数据的详细分类，对于数据的过滤必须要严谨，应当考虑敏感字体和敏感图片的过滤。

　　可能遇到的问题有，在数据交互过程中，出现由于属性名的差距导致的数据交互失败。由于Css属性设置的问题，导致界面不完整等等。设计的算法都是自己编写的，可能存在不是最优算法的情况。
# 二、设计正文
## 1 需求分析
　　建立一个用户可以自由交易的平台，通过ajax实现局部刷新，实现网站更具人性化，具有更良好的互动。以下是总体需求

### 1.1 通过手机号码注册账号并且登陆
　　每个手机号码只可以注册一个账号，并且通过账号完善个人信息和浏览商品，发布商品等，注册时需要通过手机号码获取验证码进行验证才能注册。
### 1.2 实现二手商城
　　商城主要显示总的商品信息，并且可以通过侧边栏点击进行信息过滤。商品点击之后可以查看详细信息。
### 1.3 站内搜索引擎
　　实现本站内特有的搜索引擎，可以输入字段，模糊查询合适的商品并且显示出来。
### 1.4 求购信息发布
　　根据需求输入相应的信息，发布求购商品。
### 1.5 求购商城
　　卖东西的用户，也可以通过求购商城查看是否有用户对自己拥有的二手物品有需求，查看详细的需求，有的话可以跟买家联系进行交易。
### 1.6 货物出售信息发布
　　卖家可以发布二手商品的信息，对商品进行描述，并且添加图片增加可信度，也方便买家查看相应的信息。
### 1.7 购物车
　　将想要的物品添加到购物车，可以修改数量，选择是否要支付，移除商品。选择收货地址，并且进行结算。
### 1.8 个人信息
　　用户发表求购信息和发布商品时需要先进行信息的完善，用户可以查看自己发布的商品，对发布的商品进行修改或删除，查看已发布求购信息，对求购的商品进行修改或删除。
## 2 概要设计
　　系统的整体结构流程图如下  

 ![这里写图片描述](https://img-blog.csdn.net/20180506142214677?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dzazExMDM=/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 2.1 系统模块
　　本系统的可以分为以下几个模块。
#### 2.1.1 商品首页
　　负责显示热门的商品信息，以及显示本网站的网站信息，导航栏负责跳转到各个页面，没有登录显示按钮可以让用户进行登陆和注册。已登录的用户显示用户名，并且可以发布商品信息，查看个人信息等。进入首页的时候，通过Ajax获取数据库中存在的热门商品数据集合，并且刷新页面的内容，点击商品之后跳转到商品详细信息模块。
#### 2.1.2 二手商城模块
　　负责显示所有的二手商品，提供类别的侧边栏给用户点击之后显示对应的商品信息。类别侧边栏的实现后，需要为每一个类别的元素都添加一个id，通过id来获取数据库中的数据，用Ajax获取数据并且刷新页面的信息。采用分页技术，防止数据过多的时候，显示在同一个页面，给用户带来不好的体验，分页支持点击下一页上一页或者直接点击指定页面，跳转到指定的页面。商品点击之后就要跳转到商品详情。	
#### 2.1.3 商品详情模块
　　负责显示指定的商品详细信息，包括图片、名字、价格、数量等，当一个商品被点击之后，通过返回的id查询到这个数据集合，跳转到商品详细信息的页面，商品发布者可以在下方查看留言，并且与有意者打成交易意向。将对应的信息显示出来，并且提供加入到购物车的功能。商品详细信息下方显示其他用户的留言，并且已经登录的用户可以对这件商品进行评论，商品发布者可以在下方查看留言，并且与有意者打成交易意向。商品发布者可以在下方查看留言，并且与有意者打成交易意向。
#### 2.1.4 站内搜索引擎
　　每一个页面顶部都存在一个搜索输入框，用户通过输入模糊的商品信息，后台数据库通过查询过滤相关的商品信息，并且显示出来给用户查看，显示出来的商品点击之后可以显示商品的详细信息。
#### 2.1.5 发布商品
　　用户输入指定的信息，以及选择商品的图片，之后将这些信息结合当前登陆的用户，通过Ajax发表到后台，并且通过框架存储数据到数据库指定表。
#### 2.1.6 发布求购信息
　　用户输入指定的信息，以及选择商品的图片，之后将这些信息结合当前登陆的用户，通过Ajax发表到后台，并且通过框架存储数据到数据库指定的求购信息表。
#### 2.1.7 个人信息模块
　　显示个人信息，例如用户名、真实姓名、宿舍号、学号等，显示之后还需要支持对于数据进行修改，修改之后，要同步修改页面的信息，这需要用到Ajax进行数据的提交，并且进行页面的局部刷新。
#### 2.1.8 我发布的商品模块
　　显示个人发表的商品信息，支持点击之后对数据进行修改，例如修改商品名字，修改商品的单价和数量等，修改之后将新的数据提交到数据库，数据库执行相应的修改操作，也可以直接下架某件商品，点击删除按钮之后，直接在后台数据库删除这一件商品，并且刷新当前页面上显示的个人发布的商品。给用户带来更好的体验效果。
#### 2.1.9 我发布的求购信息模块
　　显示个人发表的求购商品信息，支持点击之后对数据进行修改，例如修改商品名字，修改商品的单价和数量等，修改之后将新的数据提交到数据库，数据库执行相应的修改操作，也可以直接下架某件商品，点击删除按钮之后，直接在后台数据库删除这一件商品，并且刷新当前页面上显示的个人求购的商品。
#### 2.1.10 购物车模块
　　显示用户加入购物车的商品，计算总的价格，提供全选和取消全选的按钮，从后台获取商品的单价，判断当前剩余的数量，当用户点击数量添加或者减少之后，对于总价要实时刷新，采用jQuery对数据进行修改，当用户取消选中其中的某一个商品，要相应的减少价格并且刷新，提供选择收货地址，对收获地址进行管理，选好收货地址之后，结算购物车，弹出支付页面，让用户选择付款方式，并且提交。
#### 2.1.11 登录注册模块
　　用户通过手机号码和密码进行登录，登录之后显示首页。当用户没有账号的时候，提示用户进行注册，从登录界面切换到注册界面，注册需要通过手机号码获取验证码，后台通过页面传递的手机号码，随机生成4位数的验证码并且缓存，之后通过发送139邮箱的方式发送到指定的手机，手机收取到验证码之后输入验证码提交，判断是否正确，正确则注册成功，失败则注册失败。用户注册完之后直接跳转到首页。


##  2.2 数据结构设计
　　首页需要的数据是热门商品的信息，商品信息需要建立一个Bean对象，存储内容是商品的id、商品名称、商品单价、商品类别、商品数量、商品详细信息、商品成色、商品附带的图片地址、热门程度、发表用户的id、留言的集合，当用户发表之后，保存数据到Bean对象中，并将它存储到数据库。首页请求数据之后，根据热门度返回多个数据，将数据存储到list集合中，并且将它转换为JSON格式数据，返回到页面，页面解析数据并且显示。

　　商场则负责显示所有的商品数据，实现侧边栏点击指定的类别之后，显示对应类别的数据，需要的是类别的id，因此类别Bean对象的数据是类别id、类别名称，点击之后，通过类别id获取到商品详情集合，并且将它转为JSON格式的数据，返回到前端页面，显示数据。

　　点击商品之后，需要显示商品详细信息，通过商品的id返回指定商品的Bean对象，转化为JSON格式的数据，返回到前端页面显示，需要显示商品的留言信息，因此需要留言的Bean对象，包括数据留言id、留言的商品id、留言内容、留言时间，结合商品的详情返回JSON格式数据，前端解析之后显示。

　　求购商城，负责显示所有的求购商品，需要求购商品的Bean，内容包括求购商品id、求购商品名称、求购商品数量、求购商品单价、求购商品详细信息、求购商品留言集合。页面显示时从后台返回对象集合转变的JSON数据，前端解析数据并且显示出来。

　　登陆界面需要验证用户信息，用户信息包括内容用户id、用户名、用户的手机号码、用户密码、用户真实姓名、用户地址、用户email、用户性别、用户学号。验证的时候只需要判断手机号码和密码是否符合，符合则验证通过，返回验证结果，用JSON存储数据。失败则返回失败信息。

　　主要用到的数据结构是ArrayList负责组合各种信息，并且转换为JSON格式数据返回。数据需要排序的时候，用到的是快速排序，负责排列热门商品等的信息，并且返回数据到前端页面进行显示。

# 3 详细设计
## 3.1 数据字典
用户信息表  

| 字段名 |	字段类型|	是否可为空|	备注|
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	|  否|	主键|
|Modify	|Datetime|	  是|	修改时间|
|Username|	Varchar(50)	 | 否|	用户昵称|
|Phone|	Char(11)|	  否	|  用户手机号码|
|realName|	Varchar(20)	|  是|	  用户真实姓名|
|Clazz|	Varchar(20)	  |是|	  用户所在班级|
|Sno|	Char(12)|	  是|	用户学号|
|Dormitory|	Varchar(20)	|  是|	宿舍号|
|Gender|	Char（2）|	  是|	性别|
|Createtime	|Datetime|	  是|	创建时间|
|Avatar|	Varchar(200)|	  是	| 头像|

用户密码表  

|字段名	|字段类型|	是否可为空|	备注|
|:------:|:------:|:------:|:------:|
|Id|	Int	| 否|	主键|
|Modify	|Datetime|	 是	|修改时间|
|Password|	Varchar(24)	| 否|	用户密码|
|Uid|	Int|	否|	用户id|

商品表  

|字段名	|字段类型|	是否可为空|	备注|
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	 | 否|	主键
|Modify|	Datetime|	  是|	修改时间
|Name|	Varchar(50)	|  否|	商品名称
|Level|	Int	  |否|	商品成色
|Remark	|Varchar(255)|	  是|	  商品详细信息
|Price|	Decimal(0.00)|	  否|	商品价格
|Sort|	Int	|  否|	商品类别
|Count|	Int	|  否|	商品数量
|Display|	Int	 | 否|	 商品是否被下架
|Transaction	|Int|	  否	|    交易方式
|Sales|	Int	 | 否|	   商品销量|
|Uid	|Int	|  否|	发表的用户id|
|Image|	Varchar(255)|	  否|	商品的图片地址

商品留言  

|字段名	|字段类型|	是否可为空|	备注
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)|	  否|	主键
|Modify|	Datetime|	  是|	修改时间
|Sid|	Int	|  否|	商品的id
|Content|	Varchar(122)|	  否|	留言内容
|Display	|Int|	  否|	是否可见
|Uid	|Int	|  否|	评论的用户id

我的收藏  

|字段名	|字段类型|	是否可为空|	备注
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	 | 否|	主键
|Modify|	Datetime|	  是|	修改时间
|Sid	|Int	 | 否	|商品的id
|Display	|Int|	  否|	是否可见
|Uid	|Int	|  否|	评论的用户id

求购商品  

|字段名|	字段类型|	是否可为空|	备注
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	 | 否|	主键
|Modify|	Datetime|	  是|	修改时间
|Name|	Varchar(50)	  |否|	  求购商品名称
|Remark|	Varchar(255)|	  是|	  求购商品详情
|Price|	Decimal(0.00)|	  否|	  求购商品价格
|Sort|	Int	|  否|	  求购商品类别
|Count|	Int	|  否|	  求购商品数量
|Display|	Int	 | 否|	 信息是否被删除
|Transaction|	Int	|  否|	    交易方式
|Uid	|Int	|  否|	发表的用户id
|Image|	Varchar(255)|	  否|	商品的图片地址

求购商品留言  

|字段名|	字段类型|	是否可为空|	备注
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	|  否|	主键
|Modify|	Datetime|	  是|	修改时间
|Qid	|Int	|  否|	求购商品的id
|Content|	Varchar(122)|	  否|	留言内容
|Display|	Int|	  否|	是否可见
|Uid	|Int	 | 否|	评论的用户id


我发布的商品  

|字段名|	字段类型|	是否可为空|	备注
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	|  否|	主键
|Modify|	Datetime|	  是|	修改时间
|Display	|Int	|  否|	是否被删除
|Uid	|Int	 | 否|	用户id
|Sid	|Int|	  否|	对应商品id

我求购的商品  
|字段名|	字段类型|	是否可为空|	备注
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	 | 否|	主键
|Modify|	Datetime|	  是|	修改时间
|Display|	Int	|  否|	是否被删除
|Uid|	Int	|  否|	用户id
|Qid|	Int	|  否	|求购商品id

已购买的商品  

|字段名|	字段类型|	是否可为空|	备注
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	 | 否	|主键
|Modify|	Datetime|	  是|	修改时间
|State|	Int	 | 否|	商品当前的状态
|Uid	|Int	 | 否|	用户id
|Sid|	Int	|  否|	商品id
|Quantity|	Int	|  否|	商品数量

购物车  

|字段名|	字段类型|	是否可为空|	备注
|:------:|:------:|:------:|:------:|
|  Id|	Int(11)	|  否|	主键
|Modify|	Datetime	|  是|	修改时间
|Display|	Int|	  否|	商品是否被删除
|Uid|	Int|	  否|	用户id
|Sid|	Int|	  否|	商品id
|Quantity|	Int	|  否|	商品数量





