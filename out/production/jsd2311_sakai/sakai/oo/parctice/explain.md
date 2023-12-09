SchoolMember 是所有成员的基类，包含 name、age 和 address 属性，并有一个用于打印基本信息的方法 displayInfo()。

Teacher 继承自 SchoolMember，增加 salary 属性，并重写 displayInfo() 方法，在打印基本信息的同时输出老师的工资。

Student 继承自 SchoolMember，增加 className 和 studentId 属性，并重写 displayInfo() 方法，在打印基本信息的同时输出学生的班级和学号。