package day02;

import java.util.Arrays;

/**
 * 继承关系：
 * 1）子类型继承父类型的属性和方法，父类的属性和方法
 * 被所有子类共享，可以简化子类的开发
 * 2）子类型是多种多样的，子类型是多态的
 * <p>
 * 业务案例：四格方块（Tetromino）有七种（I,J,L,S,Z,T,O)
 * 实现方式：
 * 利用继承关系实现，其中四格方块是父类型，七种方块是
 * 子类型，在父类中定义四格数组属性，子类型就自动继承了4格属性
 * 父类型的方法子类型会被子类型继承
 * 实现：
 * 定义四格方块  Tetromino （属性：4个格，方法：下落）
 * 子类型就继承了四格方块的属性和方法
 * 子类型要定义构造器，初始化格子的位置
 * extends 扩展，是继承关键字
 */
public class Demo02 {
    public static void main(String[] args) {
//1）子类型继承父类型的属性和方法，父类的属性和方法
        //被所有子类共享，可以简化子类的开发
        T t = new T();
        I i = new I();
        J j = new J();
        L l = new L();
        S s = new S();
        Z z = new Z();
        O o = new O();
        System.out.println(Arrays.toString(t.cells));
        System.out.println(Arrays.toString(i.cells));
        System.out.println(Arrays.toString(j.cells));
        System.out.println(Arrays.toString(l.cells));
        System.out.println(Arrays.toString(s.cells));
        System.out.println(Arrays.toString(z.cells));
        System.out.println(Arrays.toString(o.cells));

        t.softDrop();//softDrop() 是从父类中继承的方法
        i.softDrop();

        //t.cells 是从父类中继承的属性
        System.out.println(Arrays.toString(t.cells));
        System.out.println(Arrays.toString(i.cells));
//2）子类型是多种多样的，子类型是多态的	
        //父类型定义的变量可以引用子类型实例
        //子类型可以造型为父类型
        Tetromino x = t;// x是T型方块
        x = i;// x引用的是I型方块
        //x 引用的对象有2种
        //x 引用的对象是多种多样的，是多态的
        System.out.println(Arrays.toString(x.cells));
    }
}

class T extends Tetromino {
    public T() {
        this.cells[0] = new Cell(0, 4);//旋转轴
        this.cells[1] = new Cell(0, 3);
        this.cells[2] = new Cell(0, 5);
        this.cells[3] = new Cell(1, 4);
    }
}

class I extends Tetromino {//I 是一种具体的四格方块

    public I() {
        //cells 是从父类型中继承的属性
        this.cells[0] = new Cell(0, 4);//旋转轴
        this.cells[1] = new Cell(0, 3);
        this.cells[2] = new Cell(0, 5);
        this.cells[3] = new Cell(0, 6);
    }
}

class J extends Tetromino {
    public J() {
        this.cells[0] = new Cell(0, 4);//旋转轴
        this.cells[1] = new Cell(0, 3);
        this.cells[2] = new Cell(0, 5);
        this.cells[3] = new Cell(1, 4);
    }
}

class L extends Tetromino {
    public L() {
        this.cells[0] = new Cell(0, 4);//旋转轴
        this.cells[1] = new Cell(0, 3);
        this.cells[2] = new Cell(0, 5);
        this.cells[3] = new Cell(1, 4);
    }
}

class S extends Tetromino {
    public S() {
        this.cells[0] = new Cell(0, 4);//旋转轴
        this.cells[1] = new Cell(0, 3);
        this.cells[2] = new Cell(0, 5);
        this.cells[3] = new Cell(1, 4);
    }
}

class Z extends Tetromino {
    public Z() {
        this.cells[0] = new Cell(0, 4);//旋转轴
        this.cells[1] = new Cell(0, 3);
        this.cells[2] = new Cell(0, 5);
        this.cells[3] = new Cell(1, 4);
    }
}

class O extends Tetromino {
    public O() {
        this.cells[0] = new Cell(0, 4);//旋转轴
        this.cells[1] = new Cell(0, 3);
        this.cells[2] = new Cell(0, 5);
        this.cells[3] = new Cell(1, 4);
    }
}

class Tetromino {//四格方块
    Cell[] cells = new Cell[4];//{null,null,null,null} ;//四个空格子

    public void softDrop() {//下落一步
        cells[0].row++;
        cells[1].row++;
        cells[2].row++;
        cells[3].row++;
    }

    public void moveLeft() {// 左
        cells[0].col--;
        cells[1].col--;
        cells[2].col--;
        cells[3].col--;
    }

    public void moveRight() {// 右
        cells[0].col++;
        cells[1].col++;
        cells[2].col++;
        cells[3].col++;
    }
}

class Cell {
    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public String toString() {
        return " [ " + row + " , " + col + " ] ";
    }
}





