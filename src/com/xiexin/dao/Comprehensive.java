package com.xiexin.dao;

import java.util.List;
import java.util.Map;

public interface Comprehensive {

    //多表联查
List<Map> comprehensive06();
List<Map> comprehensive07(Map map);
List<Map> comprehensive08();
List<Map> comprehensive09();
List<Map> comprehensive10();

int updata(Map map);
int updata01();
int dele();
}
