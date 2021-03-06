package com.mycompany.myapp.domain;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import com.mycompany.myapp.web.rest.TestUtil;

public class UsuarioTest {

    @Test
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Usuario.class);
        Usuario usuario1 = new Usuario();
        usuario1.setId("id1");
        Usuario usuario2 = new Usuario();
        usuario2.setId(usuario1.getId());
        assertThat(usuario1).isEqualTo(usuario2);
        usuario2.setId("id2");
        assertThat(usuario1).isNotEqualTo(usuario2);
        usuario1.setId(null);
        assertThat(usuario1).isNotEqualTo(usuario2);
    }
}
