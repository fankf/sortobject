### sortobject

Java对象排序

### 20200419 记录
#### 排序方式
    想要达到排序的效果 必须封装到SortObject对象中
    1. 封装排序对象 SortObject
        排序字段 String sortFiled 
        实例对象 T sortObject
    2. 封装完成 SortObject 后放入 List 做参数
    3. 使用Sort 工具类 sort 方法排序
    
注意:必传字段 List<SortObject> 排序封装实例和 Class<T> clazz 封装的具体实例类型
  
例如: 
  
 ``` 
  class User{
      private String id,age;
      ...set/get...
  } 
 ```
 
 封装对象：
 
 ```   
     User u1 = new User("1","12");
     User u2 = new User("2","11");
     SortObject so1 = new SortObject(u1.getAge(),u1);
     SortObject so2 = new SortObject(u2.getAge(),u2);
     List<SortObject> sos = new ArrayList<>();
     sos.add(so1);
     sos.add(so2);  
     List<User> result = Sort.sort(sos,User.class);
  ```
 result 就是排序后的结果。
 
 **Sort.sort(List<SortObject>,Class)传参扩展**
* CompareEnum 枚举类型
 
现在计算sortFiled大小可以按照数字方式(可转换BigDecimal)计算大小。
也可以按照ASCII码比较字符大小，由前到后，前面一样的，字符串长的放后面

* AlgorithmEnum 算法

目前（20200419）有冒泡排序 BubbleSort 和 选择排序 SelectionSort 
  
* boolean asc 默认 true

true 顺序排列，false 倒序排列    

* SortObjectList对象 

包括原始参数和扩展所有的参数  
   
**待优化**
1. 增加排序算法
2. 当没有选择算法的时候，按照一定规则选择算法，目前是冒泡法（待评估）
3. 封装对象比较麻烦，待优化
4. 传参枚举无法扩展，例如排序是否可以除数字和ASCII之外的其他方式
5. 异常情况待解决
6. 后续排序扩展，单字段分段排序和相同值额外字段排序（待评估）


#### 20200511
增加组装数据方式，通过反射获取对象值，之后再次排序