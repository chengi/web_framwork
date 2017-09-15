package cn.itcast.ssm.service.inter;

import java.util.List;

import cn.itcast.ssm.entity.Classes;

public interface ClassesServiceInter {
	public List<Classes> getAllClasses() throws Exception;
}
