package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author Zed
 * @date 2020/2/25 上午1:21
 * @contact shadowl91@163.com
 */
public interface MyMapper<T> extends MySqlMapper<T>, Mapper<T> {
}
