本工程为QM工程，分为多个模块：
1.qm_app 为web展示部分,采用thymeleaf 引擎
2.qm_biz 为service层业务逻辑代码
3.qm_dao 为数据访问层（改为使用Mybatis）, 连接池采用HikariDataSource
4.qm_common 为公共部分，提供工具类，参数等工具