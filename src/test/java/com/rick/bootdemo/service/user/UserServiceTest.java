package com.rick.bootdemo.service.user;

import com.rick.bootdemo.dao.user.UserMapper;
import com.rick.bootdemo.domain.User;
import com.rick.bootdemo.service.user.Impl.UserServiceImpl;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class UserServiceTest {
    @Mock
    private UserMapper userMapper;

    @InjectMocks
    private UserServiceImpl userService;

    private static final User user1 = new User();
    private static final User user2 = new User();

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        prepareData();
    }

    /**
     * 准备数据
     */
    private void prepareData () {
        user1.setName("Rick");
        user2.setName("kay");
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        when(userMapper.queryAll()).thenReturn(list);
    }

    @Test
    public void queryAllTest() {
        List<User> userList = userService.queryAll();
        assertEquals("Rick", userList.get(0).getName());
    }

    @AfterEach
    public void tearDown() throws Exception {
    }
}
