package MySQL01;
/**
 * 数据库当中最基本的单元是表：table
 * 数据库当中是以表格的形式表示数据的
 * 行(row):被称为数据/记录
 * 列：(column):被称为字段
 *
 * 了解一下：
 *  每一个字段都有：字段名，数据类型。约束等属性
 *  字段名可以理解，是一个普通的名字，见名思意就行
 *  数据类型：字符串，数字，日期等，后期讲
 *
 *  约束：约束也有很多，其中有一个叫做唯一性约束
 *      这种约束添加之后，该字段中的数据不能重复
 *
 *
 *      2.关于SQL语句的分类
 *          分为：
 *              DQL：
 *                  数据查询语言（凡是带有select关键字的都是查询语句）
 *                  select....
 *
 *              DML:
 *                  数据操作语言：（凡是对表当中的数据进行增删改的 都是DML）
 *                  insert delete update
 *                  insert 增
 *                  delete 删
 *                  update 改
 *
 *                  这个主要是操作表中的数据data
 *
 *              DDL:
 *                  数据定义语言
 *                  凡是带有create,drop,alter的都是DDL
 *                  DDL主要操作的是表的结构，不是表中的数据
 *                  create:新建，等同于增
 *                  drop:删除
 *                  alter:修改
 *                  这个增删改和DNL不同，这个主要是对表结构进行操作
 *
 *              TCL:
 *                  是事务控制语言
 *                  包括：
 *                      事务提交：commit
 *                      事务回滚：rollback
 *
 *               DCL:
 *                  是数据控制语言
 *                  例如：授权grant,撤销权限revoke....
 */

public class Day01 {
    /*  不区分大小写；对数据库操作的语句要加分号
    *   net stop mysql:结束MySQL服务
    *   net start mysql:开始MySQL服务
    *   select version();:查询MySQL版本号
    *   show databases;:浏览数据库系统里的数据库
    *   use  数据库名;：使用选择的数据库
    *   show tables;:浏览数据库里的表
    *   create database; 数据库名：创建数据库
    *   mysql -uroot -p密码：登录数据库系统，之后语句都要分号结尾；分号表示结束
        \c:用来终止一条命令的输入
    *   exit;:退出数据库管理系统
    *
    *   select * from 表名；:浏览某个表
    *
    *   desc 表名：不看表中的数据，只看表的结构
    *
    *   select database();：查询正在使用的是哪个表
    * */


    /*
    * source D:\MySQL\bjpowernode.sql
    * mysql> show tables;*/

    /*
    * 一.简单查询
    *   1。查询一个字段
    *       select 字段名 from 表名
    * 步骤：可以先查询表的结构得到有什么字段：desc 表名
    *
    *   2.查询多个字段
    *       使用逗号隔开","
    *       select loc,deptno from dept;
    *
    *   3.查询所有字段
    *       第一种方式：可以把每个字段都写上
    *       select a,b,c,d.... from tableName;
    *
    *       第二种方式：可以使用*
    *       select * from tableName;
    *       这种方式效率低，可读性差，实际开发中不建议使用，可在cmd窗口使用
    *
    *    4，给查询的列起别名
    *       mysql> select deptno,dname as deptname from dept;
    *       使用as关键字起别名
    *       注意：只是将显示的查询结果列名显示为deptname;原表列名还是叫dname
    *       记住：select语句是永远不会进行修改操作的（因为只负责查询）
    *
    *       as关键字可以省略
    *               mysql> select deptno,dname deptname from dept;
    *
    *       如果别名里有空格，别名用单引号括起来
    *               mysql> select deptno,dname 'dept name' from dept;
    *           数据库的字符串都是单引号括起来的，这是标准
    *
    *
    *           字段可以用数学表达式
    *           mysql> select ename,sal*12 from emp;
    *           +--------+----------+
                | ename  | sal*12   |
                +--------+----------+
                | SMITH  |  9600.00 |
                | ALLEN  | 19200.00 |
                | WARD   | 15000.00 |
                | JONES  | 35700.00 |
                | MARTIN | 15000.00 |
                | BLAKE  | 34200.00 |
                | CLARK  | 29400.00 |
                | SCOTT  | 36000.00 |
                | KING   | 60000.00 |
                | TURNER | 18000.00 |
                | ADAMS  | 13200.00 |
                | JAMES  | 11400.00 |
                | FORD   | 36000.00 |
                | MILLER | 15600.00 |
                +--------+----------+

    *           可以起别名
    *           mysql> select ename,sal*12 as yearsal from emp;
    *           +--------+----------+
                | ename  | yearsal  |
                +--------+----------+
                | SMITH  |  9600.00 |
                | ALLEN  | 19200.00 |
                | WARD   | 15000.00 |
                | JONES  | 35700.00 |
                | MARTIN | 15000.00 |
                | BLAKE  | 34200.00 |
                | CLARK  | 29400.00 |
                | SCOTT  | 36000.00 |
                | KING   | 60000.00 |
                | TURNER | 18000.00 |
                | ADAMS  | 13200.00 |
                | JAMES  | 11400.00 |
                | FORD   | 36000.00 |
                | MILLER | 15600.00 |
                +--------+----------+
                *
                * 别名是中文用单引号括起来
                * mysql> select ename,sal*12 as '年薪' from emp;
     *
   */

    /*二.条件查询
    *   什么是条件查询
    *   不是将表中所有的数据查询出来，而是查询出来符合条件的
    *   语法格式：
    *       select
    *           字段一，字段二，字段三....
    *       from
    *           表名
    *       where
    *           条件
    *
    *   mysql> select empno,ename from emp where sal<3000;
            +-------+--------+
            | empno | ename  |
            +-------+--------+
            |  7369 | SMITH  |
            |  7499 | ALLEN  |
            |  7521 | WARD   |
            |  7566 | JONES  |
            |  7654 | MARTIN |
            |  7698 | BLAKE  |
            |  7782 | CLARK  |
            |  7844 | TURNER |
            |  7876 | ADAMS  |
            |  7900 | JAMES  |
            |  7934 | MILLER |
            +-------+--------+
            *
            *   between....and
            * 查询薪水在2450和3000之间的员工名字和等级
            * 方法一：mysql> select empno,ename from emp where sal>=2450 and sal<=3000;
            * 方法二：mysql> select empno,ename from emp where sal between 2450 and 3000;
            *
            *   is null  不为空：is not null。
            * 查询那些员工的补贴空 ：is null  不为空：is not null。
            * mysql> select empno,ename from emp where comm is null;
            *
            *       and并且,or或者，in包含
            * 查询岗位是manager并且薪水大于2500的人名字和等级
            * mysql>  select empno,ename from emp where job ='manager' and sal >2500;
            *
            * 查询岗位是manager并且salesman的人名字和等级
            * mysql>  select empno,ename from emp where job =  'manager' or job = 'salesman';
            *
            * and 和or 同时出现 and 优先级更高，如果想要or先执行，需要加“小括号”
            * 以后开发中不确定优先级就用小括号
            * mysql> select * from emp where sal > 2500 and (deptno = 10 or deptno = 20);
            *
            *       in()，  not in():括号里是具体值，相当于多个or
            * 查询工资是800或5000的员工
            * mysql> select ename from emp where sal in (800,5000);
            *
            *       like
            *           称为模糊查询，支持%或下划线匹配
            *           %匹配任意多个字符
            *           下划线：任意一个字符， 查询名字里有下划线的：用转义字符\
            *           （%是一个特殊字符，_也是一个特殊字符）
            * 查询名字里有o的
            * mysql> select ename from emp where ename like '%o%';
            * 查询名字以t结尾的
            * mysql> select ename,empno from emp where ename like '%t';
            * 查询名字第二个字母是a的
            * mysql> select ename from emp where ename like '_a%';
            * 查询名字里有下划线的：用转义字符\
            * mysql> select ename from emp where ename like '%\_%';
            *
            *
            *
            * 三.排序
            *   格式
            *       select
            *            字段一，字段二，字段三....
            *       from
            *           表名
            *        order by
            *   `       条件
            * 默认升序，从小到大
            * 指定升序
            * 加asc
            *
            * 指定降序
            * 条件后加desc关键字是降序
            * mysql> select ename, sal from emp order by sal desc;
            *
            * 按照多个字段排序，先按照薪水升序再按照名字升序，主要条件和次要条件
            * mysql> select ename,sal from emp order by sal asc,ename asc;
            *
            * 按第二列sal 排序，了解一下
            * mysql> select ename, sal from emp order by 2 asc
            * 开发中不建议使用，;
            *
            * 查询薪水在1250到3000之间的员工信息，要求按照薪水降序排序
            * mysql> select * from emp where sal between 1250 and 3000 order by sal desc;
            * select * from emp where sal >=1250 and sal <=3000 order by sal desc;
            *
            *总结；
            *       select
            *           ....
            *       from
            *           ....
            *       where
            *           ....
            *       order by (排序在最后)
            *
            * */

}
