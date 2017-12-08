package cn.e3.manager.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.e3.domain.TbItem;
import cn.e3.manager.service.ItemService;
import cn.e3.mapper.TbItemMapper;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private TbItemMapper itemapper;
	@Override
	public TbItem findIntemByID(Long item) {
		TbItem tbItem = itemapper.selectByPrimaryKey(item);
		
		return tbItem;
	}

}
