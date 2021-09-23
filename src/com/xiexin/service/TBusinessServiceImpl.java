package com.xiexin.service;

import com.xiexin.bean.TBusiness;
import com.xiexin.bean.TBusinessExample;
import com.xiexin.dao.TBusinessDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("tBusinessService")
public class TBusinessServiceImpl implements TBusinessService {
	@Autowired(required = false)
	private TBusinessDAO tBusinessDAO;
	@Override
	public long countByExample(TBusinessExample example){
    	return tBusinessDAO.countByExample(example);
    }

	@Override
	public int deleteByExample(TBusinessExample example){
    	return tBusinessDAO.deleteByExample(example);
    }

	@Override
	public int deleteByPrimaryKey(Integer id){
    	return tBusinessDAO.deleteByPrimaryKey(id);
    }

	@Override
	public int insert(TBusiness record){
    	return tBusinessDAO.insert(record);
    }

	@Override
	public int insertSelective(TBusiness record){
    	return tBusinessDAO.insertSelective(record);
    }

	@Override
	public List<TBusiness> selectByExample(TBusinessExample example){
    	return tBusinessDAO.selectByExample(example);
    }

	@Override
	public TBusiness selectByPrimaryKey(Integer id){
    	return tBusinessDAO.selectByPrimaryKey(id);
    }
  
	@Override
	public int updateByExampleSelective(TBusiness record, TBusinessExample example){
    	return tBusinessDAO.updateByExampleSelective(record, example);
    }

	@Override
	public int updateByExample(TBusiness record, TBusinessExample example){
    	return tBusinessDAO.updateByExample(record, example);
    }

	@Override
	public int updateByPrimaryKeySelective(TBusiness record){
    	return tBusinessDAO.updateByPrimaryKeySelective(record);
    }

	@Override
	public int updateByPrimaryKey(TBusiness record){
    	return tBusinessDAO.updateByPrimaryKey(record);
    }

	@Override
	public List<Map> seelctTwoTable() {


		return tBusinessDAO.seelctTwoTable();
	}


}
