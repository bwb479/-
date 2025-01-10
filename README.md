# 瑞吉外卖

## 项目介绍

瑞吉外卖是一个专业的外卖订餐平台,包含移动端和管理端。移动端提供给消费者使用,可以在线浏览菜品、添加购物车、下单等。管理端提供给商家使用,可以维护菜品、套餐、订单等。

## 技术选型

### 后端技术

- Spring Boot:简化 Spring 应用的初始搭建以及开发过程
- Spring MVC:视图控制器
- MyBatis Plus:持久层框架
- MySQL:关系型数据库
- Swagger:接口文档生成工具
- Lombok:简化实体类开发

## 系统架构

项目采用经典的 MVC 三层架构:

- Controller 层:接收请求,处理请求参数,调用 Service 层,返回结果
- Service 层:处理业务逻辑,调用 Mapper 层
- Mapper 层:与数据库交互

### 项目结构

src/main/java/com/itheima/reggie

- common // 公共类
- config // 配置类
- controller // 控制器
- dto // 数据传输对象
- entity // 实体类
- filter // 过滤器
- mapper // 数据访问层
- service // 业务逻辑层

## 接口文档

项目集成了 Swagger 文档,启动项目后可通过以下地址访问:

- 接口文档地址:http://localhost:8080/doc.html

### 主要接口模块

- 员工管理接口
- 分类管理接口
- 菜品管理接口
- 套餐管理接口
- 订单管理接口
- 购物车接口
- 用户接口
- 地址簿管理接口

## 开发环境

- JDK 1.8
- Maven 3.8.1
- MySQL 8
- IDEA 2021.1

## 项目特点

1. 采用 SpringBoot 框架,简化了开发流程
2. 使用 MyBatis Plus 简化了数据库操作
3. 集成 Swagger 生成接口文档,方便接口对接
4. 统一的异常处理机制
5. 统一的返回结果封装
