package com.yehhoo.ArrayListLearn;

import com.yehhoo.LinkListLearn.MyAbstractList;
import com.yehhoo.LinkListLearn.MyList;

@SuppressWarnings("unchecked")
public class MyArrayList<E> extends MyAbstractList<E> {
    /**
     * 元素的数量
     */
    /**
     * 所有的元素
     */
    private E[] elements;

    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList(int capacity){
        capacity = (capacity < DEFAULT_CAPACITY) ? DEFAULT_CAPACITY : capacity;
        elements = (E[]) new Object[capacity];
    }
    public MyArrayList(){
        this(DEFAULT_CAPACITY);
    }
    /**
     * 清除所有元素
     */
    public void clear() {
        for (int i = 0; i < size;i++){
            elements[i] = null;
        }
        size = 0;
    }

    /**
     * 元素的数量
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * 是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 是否包含某个元素
     * @param element
     * @return
     */
    public boolean contains(E element){
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }
    /**
     * 添加元素到尾部
     * @param element
     */
    public void add(E element){
        add(size,element);
    }
    /**
     * 获取index位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ",Size: " + size);
        }
        return elements[index];
    }
    /**
     * 设置index位置的元素
     * @param index
     * @param element
     * @return 原来的元素
     */
    public E set(int index,E element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ",Size: " + size);
        }
        E temp = elements[index];
        elements[index] = element;
        return temp;
    }
    /**
     * 在index位置插入一个元素
     * @param index
     * @param element
     */
    public void add(int index,E element){
        if (index < 0 || index > size ){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        if ((size + 1) > elements.length){
            E [] elements_tmp = elements;
            int cap = size;
            elements = (E[]) new Object[size + (cap >> 1)];
            for (int i = 0 ; i < size; i++){
                elements[i] = elements_tmp[i];
            }
        }
        for (int i = size; i > index; i--) {
            elements[i] = elements[i - 1];
        }
        elements[index] = element;
        size++;

    }
    /**
     * 删除index位置的元素
     * @param index
     * @return
     */
    public int remove(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index: " + index + ",Size: " + size);
        }
        for (int i = index;i < size; i++){
            elements[i] = elements[i+1];
        }
        size--;
        elements[size] = null;
        return index;
    }
    public void remove(E element){
        remove(indexOf(element));
    }
    /**
     * 查看元素的索引
     * @param element
     * @return
     */
    public int indexOf(E element){
        if (element == null){
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    return i;
                }
            }
        }else {
            for (int i = 0; i < size; i++) {
                if (element.equals(elements[i])) {
                    return i;
                }
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    @Override
    public String toString(){
        StringBuilder string = new StringBuilder();
        string.append("Size = ").append(size).append(", [");
        for (int i = 0; i < size; i++){
            if (i == (size - 1)){
                string.append(elements[i]);
            }else {
                string.append(elements[i]).append(", ");
            }
        }
        string.append("]");
        return string.toString();
    }





}

