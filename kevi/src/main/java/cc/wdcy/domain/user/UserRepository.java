package cc.wdcy.domain.user;

import org.apache.ibatis.annotations.Param;

import cc.wdcy.domain.shared.Repository;

/**
 * @author Shengzhao Li
 */

public interface UserRepository extends Repository {

    User findByGuid(String guid);

    void saveUser(User user);

    void updateUser(User user);

    User findByUsername(String username);
    
    void savePrivilege(@Param("userId") int userId, @Param("privilege") String privilege);

}