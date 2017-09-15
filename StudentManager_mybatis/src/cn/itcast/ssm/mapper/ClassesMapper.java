package cn.itcast.ssm.mapper;

import java.util.List;

import cn.itcast.ssm.entity.Classes;

public interface ClassesMapper {
	public List<Classes> getAllClasses() throws Exception;
}
