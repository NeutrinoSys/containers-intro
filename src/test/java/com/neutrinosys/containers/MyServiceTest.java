package com.neutrinosys.containers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class MyServiceTest {

    @InjectMocks
    private MyService myService;

    @Mock
    private MyRepository myRepository;

    @Captor
    private ArgumentCaptor<Object> argumentCaptor;

    @Test
    public void canProcess() {
        myService.process("cat");
        verify(myRepository).save(argumentCaptor.capture());

        assertThat(argumentCaptor.getValue()).isEqualTo("CAT");
    }

}
