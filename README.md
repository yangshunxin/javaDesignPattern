# design pattern
    设计模式是解决特定问题的一系列套路，是一套用来提高代码可复用性、可维护性、可读性、健壮性以及安全性的解决方案。
    本质是面向对象设计原则的实际运用，是对类的封装性、继承性和多态性以及类的关联关系和组合关系的充分理解；

# 优点
    提高程序员的思维能力、编程能力和设计能力; 
    使程序设计更加标准化、代码编制更加工程化，使软件开发效率大大提高，从而缩短软件的开发周期；
    使设计的代码可重用性高、可读性高、可靠性高、灵活性高、可维护性好；
# 设计模式的基本要素
    模式名称 
    要解决的问题
    解决方案
    效果
# GoF 23
    一种思维，一种态度，一种进步

## 创建性模式 5
    单例模式、工厂模式、抽象工厂模式、建造者模式、原型模式
## 结构性模式 7
    从程序的结构上实现松耦合，从而可以扩大整体的类结构，用来解决更大的问题
    适配器模式、桥接模式、装饰模式、组合模式、外观模式、享元模式、代理模式
## 行为型模式 11
    模板方法模式、命令模式、迭代器模式、观察者模式、中介者模式、备忘录模式、解释器模式、状态模式、策略模式、职责链模式、访问者模式

## OOP七大原则
    开闭原则：对扩展开放，对修改关闭；
    里氏替换原则：继承必须确保父类所拥有的性质在子类中仍然成立；
    依赖倒置原则：要面向接口编程，不要面向实现编程；接口一般不变
    单一职责原则：控制类的粒度大小，将对象解耦，提高其内聚性
    接口隔离原则：要为各个类建立它们需要的专用接口
    迪米特法则：只与你的直接朋友（对象）交谈，不跟“陌生人”说话
    合成复用原则：尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现

    参考链接：http://c.biancheng.net/view/1371.html

### 单例模式
    单例模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建；
    只有一个实例，必须自己创建这一个实例，并且对外提供这一个实例;
    实现方式：
        饿汉模式： 加载类时就初始化，线程安全，占用内存；
        懒汉模式： 线程不安全，占内存少，synchronized加锁对性能有影响；
        双检锁/双重校验锁-DCL模式 即 double-checked locking： 都好，不能绕过反射创建对象
        枚举模式: 效率高，占内存少，能绕过反射创建对象

### 工厂模式
    实现了创建者与调用者分离；
    核心本质： 
        实例化对象不适用new, 用工厂方法代替；
        将选择实现类，创建对象统一管理和控制，从而将调用者跟我们的实现类解耦
    分为三类：
        简单工厂模式：
            用来生产同一等级结构中的任意产品（对于增加新的产品，需要覆盖已有的代码）；
            优点：代码简单；缺点：增加要增加一个产品，除了增加一个产品类外，还需要修改工厂静态方法（不符合开闭原则）
        工厂方法模式：
            增加一个产品，选要增加一个工厂类和一个产品类， 不需要修改代码；
            工厂有工厂的接口，产品也有产品的接口，实现接口就可以增加产品
        两种方法比较：
            简单工厂模式：结构简单，代码简单，编程简单，管理简单，不符合开闭原则,使用最多
            工厂方法模式：只符合开闭原则
            故一般根据设计原：工厂方法模式；根据实际业务：简单工厂模式

### 抽象工厂模式
    围绕一个超级工厂创建其它工厂，该超级工厂又称为其他工厂的工厂；
    抽象工厂模式提供了一个创建一系列相关或者相互依赖对象的接口，无需指定他们具体的实现类；
    适用场景：
        客户端（应用层）不依赖于产品类实例如何被创建、实现等细节
        强调一系列相关的产品对象（属于同一产品族）一起使用创建对象需要大量的重复代码
        提供一个产品类的库，所有的产品以同样的接口出现，从而使得客户端不依赖于具体的实现

### 建造者模式
    建造者模式也属于创建型模式，它提供了一种创建对象的最佳方式；
    定义：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示；
    主要作用：在用户不知道 对象的建造过程和细节 的情况下就可以直接创建复杂的对象；
    客户只需要给出指定复杂对象的类型和内容，建造者模式负责按顺序创建复杂对象（把内部的建造过程和细节隐藏起来）
    Builder模式的常规用法，导演类Director在Builder模式中具有很重要的作用，它用于指导具体构建者如何构建产品，控制调用先后次序，并向调用者返回完整的产品类；
    静态内部类的方式实现零部件无需装配构造，这种方式使用更加灵活，更符合定义。内部由复杂对象的默认实现，使用时可以根据用户需求只有定义更改内容，并且无需改变具体的构造方式。就可以构造复杂的对象；
    比如：
        麦当劳可以随意搭配任意几种产品（零件）组成一款套餐，人然后出售给客户。
        
### 适配器模式
    将一个类的接口转换成客户希望的另外一个接口。Adapter模式使得原来由于接口不兼容而不能一起工作的那些类可以一起工作！
    角色分析：
        目标接口：客户所期待的接口，目标可以是具体的或抽象的实现，也可以是接口
        需要适配的类： 需要适配的类或者适配者类
        适配器：通过包装一个需要适配的对象，把原接口转换成目标对象
    对象适配器的优点：
        一个对象适配器可以把多个不同的适配者适配到同一个目标
        可以适配一个适配者的子类，由于适配器和适配者之间是关联关系，根据“里氏代换原则”，适配者的子类也可通过该适配器进行适配

    类适配器的缺点：
        java和C#是不支持多继承的语言，一次最多只能适配一个适配者类，
    适用场景：
        系统需要使用一些现有的类，而这些类的接口（如方法名）不符合系统的需要，甚至没有这些类的源代码
        想创建一个可以重复使用的类，用于与一些彼此之间没有太大关联的一些类，包括一些可能在将来引进的类一起工作

### 桥接模式
    桥接模式是将抽象部分与它的实现部分分离，使它们都可以独立地变化。它是一种对象结构型模式，又称为柄体(Handle and Body)模式或接口(interface)模式。
    优势：
        桥接模式类似于多继承方案，但是多继承方案违背了类的单一职责原则，复用性比较差，类的个数比较多，桥接模式就很好的解决类这些问题；
        桥接模式提高了子系统的可扩展性，在两个变化维度中任意扩展一个维度，都不需要修改原有系统，符合开闭原则，就像一座桥，可以把两个变化的维度连接起来；
    劣势：
        增加类系统的理解和设计难度；
    最佳实践：
        一个类存在两个独立变化的维度，且这两个维度都需要进行扩展

### 代理模式
    定义：
        由于某些原因需要给某对象提供一个代理，以控制对该对象的访问。这时，访问对象不适合或者不能直接引用目标对象，代理对象作为访问对象和目标对象之间的中介；
    优点：
        代理模式在客户端与目标对象之间起到了一个中介作用和保护目标对象的作用
        代理对象可以哭空战目标对象的功能
        代理模式能将客户端与目标对象分离，在一定程度上降低系统的耦合度，增加了程序的可扩展性
    缺点：
        代理模式会造成系统设计中类的数量增加
        在客户端和目标对象之间增加一个代理对象，会造成请求处理速度变慢；
        增加了系统的复杂度；

    结构：
        抽象主题（Subject）类：通过接口或抽象类声明真实主题和代理对象实现的业务方法。
        真实主题（Real Subject）类：实现了抽象主题中的具体业务，是代理对象所代表的真实对象，是最终要引用的对象。
        代理（Proxy）类：提供了与真实主题相同的接口，其内部含有对真实主题的引用，它可以访问、控制或扩展真实主题的功能。

    类型：
        静态代理：由程序员创建代理类或特定工具自动生成源代码再对其编译，在程序运行前代理类的.class文件就已经存在类
        动态代理：在程序运行时，运用反射机制动态创建而成
    静态代理很简单，就不多说；
    动态代理： 基于接口的动态代理（jdk动态代理），基于类的动态代理（cglib）
        代理对象不需要实现接口
        代理对象的生成是利用JDK的API动态的在内存中构建代理对象
        能在代码运行时动态地改变某个对象的代理，并且能为代理对象动态地增加方法和行为
    一般情况下，动态代理的底层不用我们亲自去实现，可以使用线程提供的 API 。例如，在 Java 生态中，目前普遍使用的是 JDK 自带的代理和 GGLib 提供的类库。
    JDK 实现代理只需要使用 newProxyInstance 方法，该方法需要接收三个参数，语法格式如下：
        static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h )
    注意该方法在 Proxy 类中是静态方法，且接收的三个参数说明依次为：
        ClassLoader loader：指定当前目标对象使用类加载器，获取加载器的方法是固定的
        Class<?>[] interfaces：目标对象实现的接口的类型，使用泛型方式确认类型
        InvocationHandler h：事件处理，执行目标对象的方法时，会触发事件处理器的方法，把当前执行目标对象的方法作为参数传入
    动态代理的优点：
        增加代理接口不用不用增加代码

### 装饰器模式
    装饰器（Decorator）模式的定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式；
    优点：
        装饰器是继承的有力补充，比继承灵活，在不改变原有对象的情况下，动态的给一个对象扩展功能，即插即用
        通过使用不用装饰类及这些装饰类的排列组合，可以实现不同效果
        装饰器模式完全遵守开闭原则
    缺点：装饰器模式会增加许多子类，过度使用会增加程序得复杂性。
    装饰器模式的结构与实现：
        通常情况下，扩展一个类的功能会使用继承方式来实现。但继承具有静态特征，耦合度高，并且随着扩展功能的增多，子类会很膨胀。
        如果使用组合关系来创建一个包装对象（即装饰对象）来包裹真实对象，并在保持真实对象的类结构不变的前提下，为其提供额外的功能，这就是装饰器模式的目标。下面来分析其基本结构和实现方法。
    角色：
        抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
        具体构件（ConcreteComponent）角色：实现抽象构件，通过装饰角色为其添加一些职责。
        抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
        具体装饰（ConcreteDecorator）角色：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。

### 外观模式
    定义：
        外观（Facade）模式又叫作门面模式，是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。
        该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。
    
        在日常编码工作中，我们都在有意无意的大量使用外观模式。只要是高层模块需要调度多个子系统（2个以上的类对象），我们都会自觉地创建一个新的类封装这些子系统，提供精简的接口，让高层模块可以更加容易地间接调用这些子系统的功能。
        尤其是现阶段各种第三方SDK、开源类库，很大概率都会使用外观模式。
    外观（Facade）模式是“迪米特法则”的典型应用，它有以下主要优点：
        降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
        对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。
        降低了大型软件系统中的编译依赖性，简化了系统在不同平台之间的移植过程，因为编译一个子系统不会影响其他的子系统，也不会影响外观对象。
    缺点：
        1.不能很好地限制客户使用子系统类，很容易带来未知风险。
        2.增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”。
    结构与实现：
        外观（Facade）模式的结构比较简单，主要是定义了一个高层接口。它包含了对各个子系统的引用，客户端可以通过它访问各个子系统的功能。现在来分析其基本结构和实现方法。
        模式的结构：
            外观（Facade）角色：为多个子系统对外提供一个共同的接口。
            子系统（Sub System）角色：实现系统的部分功能，客户可以通过外观角色访问它。
            客户（Client）角色：通过一个外观角色访问各个子系统的功能。

### 享元模式
    遇到的困难：
        在面向对象程序设计过程中，有时会面临要创建大量相同或相似对象实例的问题。创建那么多的对象将会耗费很多的系统资源，它是系统性能提高的一个瓶颈；
    享元（Flyweight）模式的定义：
        运用共享技术来有效地支持大量细粒度对象的复用。它通过共享已经存在的对象来大幅度减少需要创建的对象数量、避免大量相似类的开销，从而提高系统资源的利用率。
    
    优点：
        相同对象只要保存一份，这降低了系统中对象的数量，从而降低了系统中细粒度对象给内存带来的压力。
    缺点：
        1.为了使对象可以共享，需要将一些不能共享的状态外部化，这将增加程序的复杂性。
        2.读取享元模式的外部状态会使得运行时间稍微变长。
    结构与实现：
        享元模式的定义提出了两个要求，细粒度和共享对象。因为要求细粒度，所以不可避免地会使对象数量多且性质相近，此时我们就将这些对象的信息分为两个部分：内部状态和外部状态。
        内部状态指对象共享出来的信息，存储在享元信息内部，并且不随环境的改变而改变；
        外部状态指对象得以依赖的一个标记，随环境的改变而改变，不可共享。
    使用场景：
        连接池中的连接对象，保存在连接对象中的用户名、密码、连接URL等信息，在创建对象的时候就设置好了，不会随环境的改变而改变，这些为内部状态。而当每个连接要被回收利用时，我们需要将它标记为可用状态，这些为外部状态。
    享元模式的本质是缓存共享对象，降低内存消耗
    
    角色：
        抽象享元角色（Flyweight）：是所有的具体享元类的基类，为具体享元规范需要实现的公共接口，非享元的外部状态以参数的形式通过方法传入。
        具体享元（Concrete Flyweight）角色：实现抽象享元角色中所规定的接口。
        非享元（Unsharable Flyweight)角色：是不可以共享的外部状态，它以参数的形式注入具体享元的相关方法中。
        享元工厂（Flyweight Factory）角色：负责创建和管理享元角色。当客户对象请求一个享元对象时，享元工厂检査系统中是否存在符合要求的享元对象，如果存在则提供给客户；如果不存在的话，则创建一个新的享元对象

### 组合模式
    定义：
        组合（composite pattern）模式又叫做整体-部分（part-whole）模式, 它是将对象组合成树状的层次结构的模式，用来表示“整体-部分”的关系，使用户对单个对象和组合对象有一致的访问性，数据结构性设计模式

    组合模式一般用来描述整体与部分的关系，它将对象组织到树形结构中，顶层的结点被称为根节点，根节点下面可以包含树枝节点（有下级的节点）和叶子节点（无下级的节点）；
    根节点和树枝节点本质上属于同一种数据类型，可以作为容器使用；而叶子节点与树枝节点在语义上不属于同一种类型。但是在组合模式中，会把树枝节点和叶子节点看作同一种数据类型，让它们具备一致行为。

    这样，在组合模式中，整个树形结构中的对象都属于同一种类型，带来的好处就是用户不需要辨别是树枝节点还是叶子节点，可以直接进行操作，给用户的使用带来极大的便利。
    优点：
        组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
        更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；
    缺点：
        设计较复杂，客户端需要花更多时间理清类之间的层次关系；
        不容易限制容器中的构件；
        不容易用继承的方法来增加构件的新功能；

    结构：
        1.抽象构件（Component）角色：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。（总的抽象类或接口，定义一些通用的方法，比如新增、删除）
        2.树叶构件（Leaf）角色：是组合中的叶节点对象，它没有子节点，用于继承或实现抽象构件。
        3.树枝构件（Composite）角色 / 中间构件：是组合中的分支节点对象，它有子节点，用于继承和实现抽象构件。它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。
    组合模式分为透明式的组合模式和安全式的组合模式。
    透明方式：
        在该方式中，由于抽象构件声明了所有子类中的全部方法，所以客户端无须区别树叶对象和树枝对象，对客户端来说是透明的。但其缺点是：树叶构件本来没有 Add()、Remove() 及 GetChild() 方法，却要实现它们（空实现或抛异常），这样会带来一些安全性问题。
    安全方式：
        在该方式中，将管理子构件的方法移到树枝构件中，抽象构件和树叶构件没有对子对象的管理方法，这样就避免了上一种方式的安全性问题，但由于叶子和分支有不同的接口，客户端在调用时要知道树叶对象和树枝对象的存在，所以失去了透明性

## 行为型模式
    行为型模式用于描述程序在运行时复杂的流程控制，即描述多个类或对象之间怎样相互协作共同完成单个对象都无法完成的任务，
    它涉及算法与对象间职责的分配。
    行为型模式分为：类行为模式和对象行为模式，
        类行为模式：采用继承机制在类间分派行为
        对象行为模式：采用组合或聚合在对象间分配行为
    由于组合关系或聚合关系比继承关系耦合度低，满足“合成复用原则”，故对象行为模式具有更大的灵活性
    总共有11种：
        1.模板方法（Template Method）模式：定义一个操作中的算法骨架，将算法的一些步骤延迟到子类中，使得子类在可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
        2.策略（Strategy）模式：定义了一系列算法，并将每个算法封装起来，使它们可以相互替换，且算法的改变不会影响使用算法的客户。
        3.命令（Command）模式：将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分割开。
        4.职责链（Chain of Responsibility）模式：把请求从链中的一个对象传到下一个对象，直到请求被响应为止。通过这种方式去除对象之间的耦合。
        5.状态（State）模式：允许一个对象在其内部状态发生改变时改变其行为能力。
        6.观察者（Observer）模式：多个对象间存在一对多关系，当一个对象发生改变时，把这种改变通知给其他多个对象，从而影响其他对象的行为。
        7.中介者（Mediator）模式：定义一个中介对象来简化原有对象之间的交互关系，降低系统中对象间的耦合度，使原有对象之间不必相互了解。
        8.迭代器（Iterator）模式：提供一种方法来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。
        9.访问者（Visitor）模式：在不改变集合元素的前提下，为一个集合中的每个元素提供多种访问方式，即每个元素有多个访问者对象访问。
        10.备忘录（Memento）模式：在不破坏封装性的前提下，获取并保存一个对象的内部状态，以便以后恢复它。
        11.解释器（Interpreter）模式：提供如何定义语言的文法，以及对语言句子的解释方法，即解释器。

    模板方法模式和解释器模式是类行为型模式，其它都是对象行为型模式

### 模板方法模式    
    我们把这些规定了流程或格式的实例定义成模板，允许使用者根据自己的需求去更新它；
    模板方法（Template Method）模式定义如下：
        定义一个操作中的算法骨架，而将算法的一些步骤延迟到子类中，使得子类可以不改变该算法结构的情况下重定义该算法的某些特定步骤。
        它是一种类行为型模式。
    优点：
        1.它封装了不变部分，扩展可变部分。它把认为是不变部分的算法封装到父类中实现，而把可变部分算法由子类继承实现，便于子类继续扩展。
        2.它在父类中提取了公共的部分代码，便于代码复用。
        3.部分方法是由子类实现的，因此子类可以通过扩展方式增加相应的功能，符合开闭原则。
    缺点：
        1.对每个不同的实现都需要定义一个子类，这会导致类的个数增加，系统更加庞大，设计也更加抽象，间接地增加了系统实现的复杂度。
        2.父类中的抽象方法由子类实现，子类执行的结果会影响父类的结果，这导致一种反向的控制结构，它提高了代码阅读的难度。
        3.由于继承关系自身的缺点，如果父类添加新的抽象方法，则所有子类都要改一遍。
    结构与实现：
        模板方法模式需要注意抽象类与具体子类之间的协作。它用到了虚函数的多态性技术以及“不用调用我，让我来调用你”的反向控制技术。现在来介绍它们的基本结构。
        1. 抽象类/抽象模板（abstract class）
            抽象模板类，负责给出一个算法的轮廓和骨架。它由一个模板方法和若干个基本方法构成。
            模板方法：定义了算法的骨架，按某种顺序调用其包含的基本方法
            基本方法：是整个算法中的一个步骤，包含以下几种类型。
            抽象方法：在抽象类中声明，由具体子类实现。
            具体方法：在抽象类中已经实现，在具体子类中可以继承或重写它。
            钩子方法：在抽象类中已经实现，包括用于判断的逻辑方法和需要子类重写的空方法两种。
        2. 具体子类/具体实现（Concrete Class）
            具体实现类，实现抽象类中所定义的抽象方法和钩子方法，它们是一个顶级逻辑的一个组成步骤
### 策略模式   
    背景：
        在软件开发中也常常遇到类似的情况，当实现某一个功能存在多种算法或者策略，我们可以根据环境或者条件的不同选择不同的算法或者策略来完成该功能，如数据排序策略有冒泡排序、选择排序、插入排序、二叉树排序等；
        如果使用多重条件转移语句实现（即硬编码），不但使条件语句变得很复杂，而且增加、删除或更换算法要修改原代码，不易维护，违背开闭原则。如果采用策略模式就能很好解决该问题。
    定义：
        策略模式(Strategy)，该模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，且算法的变化不会影响使用算法的客户。
        策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同过的对象对这些算法进行管理。
    优点：
        1.多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句，如 if...else 语句、switch...case 语句。
        2.策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
        3.策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的。
        4.策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法
        5.策略模式把算法的使用放到环境类中，而算法的实现移到具体策略类中，实现了二者的分离
    缺点：
        1.客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类
        2.策略模式造成很多的策略类，增加维护难度
    结构：
        策略模式是准备一组算法，并将这组算法封装到一系列的策略类里面，作为一个抽象策略类的子类。
        策略模式的重心不是如何实现这些算法，二十如何组织这些算法，从而让程序结构更加灵活，具有更好的维护性和扩展性；
        角色：
            抽象策略（Strategy）类：定义了一个公共接口，各种不同的算法以不同的方式实现这个接口，环境角色使用这个接口调用不同的算法，一般使用接口或抽象类实现
            具体策略（Concrete Strategy）类：实现了抽象策略定义的接口，提供具体的算法实现
            环境（Context）类：持有一个策略类的引用，最终给客户端调用

### 命令模式  
    背景：
        在现实生活中，命令模式的例子也很多。比如看电视时，我们只需要轻轻一按遥控器就能完成频道的切换，这就是命令模式，将换台请求和换台处理完全解耦了。电视机遥控器（命令发送者）通过按钮（具体命令）来遥控电视机（命令接收者）
    定义：
        命令模式(command)将一个请求封装为一个对象，使发出请求的责任和执行请求的责任分隔开，这样两者之间通过命令对象进行沟通，这样方便使命令对象进行存储、传递、调用、增加与管理。
    优点：
        1.通过引入中间件（抽象接口）降低系统的耦合度。
        2.扩展性良好，增加或删除命令非常方便。采用命令模式增加与删除命令不会影响其他类，且满足“开闭原则”
        3.以实现宏命令。命令模式可以与组合模式结合，将多个命令装配成一个组合命令，即宏命令
        4.方便实现 Undo 和 Redo 操作。命令模式可以与后面介绍的备忘录模式结合，实现命令的撤销与恢复
        5.可以在现有命令的基础上，增加额外功能。比如日志记录，结合装饰器模式会更加灵活
    缺点：
        1.可能产生大量具体的命令类。因为每一个具体操作都需要设计一个具体命令类，这会增加系统的复杂性。
        2.命令模式的结果其实就是接收方的执行结果，但是为了以命令的形式进行架构、解耦请求与实现，引入了额外类型结构（引入了请求方与抽象命令接口），增加了理解上的困难
    结构：
        1.抽象命令类（Command）角色：声明执行命令的接口，拥有执行命令的抽象方法 execute()
        2.具体命令类（Concrete Command）角色：是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作
        3.实现者/接收者（Receiver）角色：执行命令功能的相关操作，是具体命令对象业务的真正实现者
        4.调用者/请求者（Invoker）角色：是请求的发送者，它通常拥有很多的命令对象，并通过访问命令对象来执行相关请求，它不直接访问接收者
### 责任链模式
    背景： 
        在计算机总线网中数据报传送，每台计算机根据目标地址是否同自己的地址相同来决定是否接收；还有异常处理中，处理程序根据异常的类型决定自己是否处理该异常；还有 Struts2 的拦截器、JSP 和 Servlet 的 Filter 等，所有这些，都可以考虑使用责任链模式来实现
    定义：
        责任链（Chain of Responsibility）模式:为了避免请求发送者与多个请求处理者耦合在一起，于是将所有请求的处理者通过前一对象记住其下一个对象的引用而连成一条链；
        当请求发生时，可将请求沿着这条链传递，直到有对象处理它为止。
    
    注意：责任链模式也叫职责链模式

    在责任链模式中，客户只需要将请求发送到责任链上即可，无须关心请求的处理细节和请求的传递过程，请求会自动进行传递。所以责任链将请求的发送者和请求的处理者解耦了；
    
    优点：
        1.降低了对象之间的耦合度。该模式使得一个对象无须知道到底是哪一个对象处理其请求以及链的结构，发送者和接收者也无须拥有对方的明确信息
        2.增强了系统的可扩展性。可以根据需要增加新的请求处理类，满足开闭原则
        3.增强了给对象指派职责的灵活性。当工作流程发生变化，可以动态地改变链内的成员或者调动它们的次序，也可动态地新增或者删除责任
        4.责任链简化了对象之间的连接。每个对象只需保持一个指向其后继者的引用，不需保持其他所有处理者的引用，这避免了使用众多的 if 或者 if···else 语句
        5.责任分担。每个类只需要处理自己该处理的工作，不该处理的传递给下一个对象完成，明确各类的责任范围，符合类的单一职责原则
    缺点：
        1.不能保证每个请求一定被处理。由于一个请求没有明确的接收者，所以不能保证它一定会被处理，该请求可能一直传到链的末端都得不到处理
        2.对比较长的职责链，请求的处理可能涉及多个处理对象，系统性能将受到一定影响
        3.职责链建立的合理性要靠客户端来保证，增加了客户端的复杂性，可能会由于职责链的错误设置而导致系统出错，如可能会造成循环调用
    结构：
        抽象处理者（Handler）角色：定义一个处理请求的接口，包含抽象处理方法和一个后继连接。
        具体处理者（Concrete Handler）角色：实现抽象处理者的处理方法，判断能否处理本次请求，如果可以处理请求则处理，否则将该请求转给它的后继者
        客户类（Client）角色：创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程
    责任链模式的本质是解耦请求与处理，让请求在处理链中能进行传递与被处理；理解责任链模式应当理解其模式，而不是其具体实现。责任链模式的独到之处是将其节点处理者组合成了链式结构，并允许节点自身决定是否进行请求处理或转发，相当于让请求流动起来
    应用场景：
        1.多个对象可以处理一个请求，但具体由哪个对象处理该请求在运行时自动确定。
        2.可动态指定一组对象处理请求，或添加新的处理者。
        3.需要在不明确指定请求处理者的情况下，向多个处理者中的一个提交请求。

### 状态模式
    背景：
        有时同一对象，不同的状态下对同一请求有不同的响应，
        传统的的解决办法是使用if-else或switch-case来做判断，弊端是：条件判断语句会过于臃肿，可读性差，且不具备扩展性，维护难度也大。且增加新的状态时要添加新的 if-else 语句，这违背了“开闭原则”，不利于程序的扩展
        状态模式的解决思路是：
            当控制一个对象状态转换的条件表达式过于复杂时，把相关“判断逻辑”提取出来，用各个不同的类进行表示，系统处于哪种情况，直接使用相应的状态类对象进行处理，这样能把原来复杂的逻辑判断简单化，消除了 if-else、switch-case 等冗余语句，代码更有层次性，并且具备良好的扩展力
    定义：
        状态（state）模式：对有状态的对象，把复杂的“判断逻辑”提取到不同的状态对象中，允许状态对象在其内部状态发生改变时改变其行为；
    优点：
        1.结构清晰，状态模式将与特定状态相关的行为局部化到一个状态中，并且将不同状态的行为分割开来，满足“单一职责原则”
        2.将状态转换显示化，减少对象间的相互依赖。将不同的状态引入独立的对象中会使得状态转换变得更加明确，且减少对象间的相互依赖
        3.状态类职责明确，有利于程序的扩展。通过定义新的子类很容易地增加新的状态和转换
    缺点：
        代码复杂
    结构：
        1.环境类（Context）角色：也称为上下文，它定义了客户端需要的接口，内部维护一个当前状态，并负责具体状态的切换
        2.抽象状态（State）角色：定义一个接口，用以封装环境对象中的特定状态所对应的行为，可以有一个或多个行为
        3.具体状态（Concrete State）角色：实现抽象状态所对应的行为，并且在需要的情况下进行状态切换

### 观察者模式
    背景：
        在现实世界中，许多对象并不是独立存在的，其中一个对象的行为发生改变可能会导致一个或者多个其他对象的行为也发生改变；
        在软件世界也是这样，例如，Excel 中的数据与折线图、饼状图、柱状图之间的关系；MVC 模式中的模型与视图的关系；事件模型中的事件源与事件处理者。所有这些，如果用观察者模式来实现就非常方
    定义：
        指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。
        这种模式有时又称作发布-订阅模式、模型-视图模式，它是对象行为型模式
    优点：
        1.降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。符合依赖倒置原则。
        2.目标与观察者之间建立了一套触发机制。
    缺点：
        1.目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用。
        2.当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率。
    结构：
        实现观察者模式时要注意具体目标对象和具体观察者对象之间不能直接调用，否则将使两者之间紧密耦合起来，这违反了面向对象的设计原则
        抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法
        具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象
        抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用
        具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态