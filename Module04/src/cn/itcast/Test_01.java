package cn.itcast;

import itheima_01.Student;

/*模块的基本使用
*   在模块的src目录下新建一个名为,module-info.java的描述性文件，改文件专门定义模块名，访问权限，模块依赖等信息
* 描述性文件中使用模块导出和模块依赖来进行配置并使用
*
* 模块中所有未导出的包都是模块私有的，他们不能在模块之外被访问的
*   在Module03这个模块下的描述性文件中配置模块导出
*   模块导出模式：exports包名；
*
* 一个模块要访问其他的模块，必须明确指定依赖那些模块，未明确指定依赖的模块不能访问
*   在Module04这个模块下的描述性文件中配置模块依赖
*   模块依赖格式：requires 模块名；
* 注意：写模块名报错，需要按下Alt+Enter提示，然后选择模块依赖
*
* 在Module04这个模块的类中使用依赖模块下的内容*/
public class Test_01 {
   /* public static void main(String[] args) {
        Student student = new Student();
        student.study();
    }

    */
}
