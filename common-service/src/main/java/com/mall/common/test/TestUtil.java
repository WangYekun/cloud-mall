package com.mall.common.test;

import com.google.gson.Gson;
import com.mall.common.util.Course;
import com.mall.common.util.StStoreOrder;
import com.mall.common.util.StStoreOrderDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mark
 * @date 2020/7/19 12:08
 * @description testUtil
 */
public class TestUtil {
    public static void main(String[] args) {

        /*// 第一版本
        Map<String, Map<String, List<StStoreOrderDetail>>> map = new HashMap<>(16);
        StStoreOrder stStoreOrder = new StStoreOrder();
        stStoreOrder.setCustomContent("11");
        StStoreOrderDetail stStoreOrderDetail = new StStoreOrderDetail();
        stStoreOrderDetail.setOrderId("2.1");
        List<StStoreOrderDetail> stStoreOrderDetails = new ArrayList<>();
        stStoreOrderDetails.add(stStoreOrderDetail);
        stStoreOrder.setStStoreOrderDetailList01(stStoreOrderDetails);
        Course course = new Course();
        course.setCId("3.1");
        List<Course> objectCourseList = new ArrayList<>();
        objectCourseList.add(course);
        stStoreOrderDetail.setCourses(objectCourseList);
        StStoreOrderDetail stStoreOrderDetail2 = new StStoreOrderDetail();
        stStoreOrderDetail2.setOrderDetailId("2.2");
        stStoreOrderDetails.add(stStoreOrderDetail2);
        Course course01 = new Course();
        course01.setCId("3.2");
        List<Course> objectCourseList01 = new ArrayList<>();
        objectCourseList01.add(course01);
        stStoreOrderDetail2.setCourses(objectCourseList01);
        Map<String, List<StStoreOrderDetail>> maps = new HashMap<>(16);
        maps.put("list11", stStoreOrderDetails);
        maps.put("list22", stStoreOrderDetails);
        map.put("test", maps);
        String json = new Gson().toJson(map);
        System.out.println("json = " + json);
        String jsonFormat = new Gson().toJson(stStoreOrder);
        System.out.println(jsonFormat);*/

        // 第二版本
        StStoreOrder stStoreOrder = new StStoreOrder();
        stStoreOrder.setCustomContent("11");
        StStoreOrderDetail stStoreOrderDetail = new StStoreOrderDetail();
        stStoreOrderDetail.setOrderId("2.1");
        List<StStoreOrderDetail> stStoreOrderDetails = new ArrayList<>();
        stStoreOrderDetails.add(stStoreOrderDetail);
        stStoreOrder.setStStoreOrderDetailList01(stStoreOrderDetails);

        List<StStoreOrderDetail> stStoreOrderDetails02 = new ArrayList<>();
        stStoreOrderDetails02.add(stStoreOrderDetail);
        stStoreOrder.setStStoreOrderDetailList02(stStoreOrderDetails02);

        List<StStoreOrderDetail> stStoreOrderDetails03 = new ArrayList<>();
        stStoreOrderDetails03.add(stStoreOrderDetail);
        stStoreOrder.setStStoreOrderDetailList03(stStoreOrderDetails03);

        Course course = new Course();
        course.setCId("3.1");
        List<Course> objectCourseList = new ArrayList<>();
        objectCourseList.add(course);
        stStoreOrderDetail.setCourses(objectCourseList);
        StStoreOrderDetail stStoreOrderDetail2 = new StStoreOrderDetail();
        stStoreOrderDetail2.setOrderDetailId("2.2");
        stStoreOrderDetails.add(stStoreOrderDetail2);
        Course course01 = new Course();
        course01.setCId("3.2");
        List<Course> objectCourseList01 = new ArrayList<>();
        objectCourseList01.add(course01);
        stStoreOrderDetail2.setCourses(objectCourseList01);
        String json = new Gson().toJson(stStoreOrder);
        System.out.println("json = " + json);
    }

}
