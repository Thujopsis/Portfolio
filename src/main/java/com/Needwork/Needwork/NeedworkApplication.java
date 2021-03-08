package com.Needwork.Needwork;

import com.Needwork.Needwork.Mapper.ListDataMapper;
import com.Needwork.Needwork.Model.ListDataModel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class NeedworkApplication {

	public static void main(String[] args) {
		SpringApplication.run(NeedworkApplication.class, args);
	}

//	private final ListDataMapper listDataMapper;
//
//	public NeedworkApplication(ListDataMapper listDataMapper){
//		//Mapperをインジェクションする。
//		this.listDataMapper = listDataMapper;
//	}
//
//	@Transactional
//	@Override
//	public void run(String... args) throws Exception{
//		ListDataModel newList = new ListDataModel();
//		newList.setName("テスト1");
//		newList.setDetails("試験用のデータ1");
//
//		listDataMapper.insert(newList);
//
//		ListDataModel loadList = listDataMapper.select(newList.getId());
//		System.out.println("ID         :" + loadList.getId());
//		System.out.println("NAME       :" + loadList.getName());
//		System.out.println("DETAILS    :" + loadList.getDetails());
//	}
}
