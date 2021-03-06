package com.needwork.needwork.Mapper;

import com.needwork.needwork.Model.FormModel;
import com.needwork.needwork.Model.ListDataModel;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
MybatisでSQLを呼ぶためのインターフェース
SQLを記述したXMLのidとメソッド名がリンクし、処理を行う
*/
@Repository
@Mapper
public interface ListDataMapper {
    //追加処理
    void insert(FormModel formModel);

    //idを指定しての選択
    ListDataModel select(int id);

    //全選択処理
    List<ListDataModel> selectAll();

    //更新処理
    void update(ListDataModel listDataModel);

    //削除処理
    void delete(int id);
}
