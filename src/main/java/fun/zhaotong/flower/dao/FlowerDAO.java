package fun.zhaotong.flower.dao;

import java.util.ArrayList;
import java.util.List;

public class FlowerDAO {
    public void insertFlower(Flower flower) {
        // todo mybatis plus的使用
    }

    public List<Flower> queryFlowerList() {
        List<Flower> result = new ArrayList<Flower>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            Flower user = new Flower();
            user.setName("刘氏小天使" + i);
            user.setRemark("未淘汰");
            user.setStatus(0);
            result.add(user);
        }
        return result;
    }
}
