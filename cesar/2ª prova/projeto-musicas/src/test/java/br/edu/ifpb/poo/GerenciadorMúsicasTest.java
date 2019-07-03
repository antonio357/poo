package br.edu.ifpb.poo;


import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Paths;

public class GerenciadorMúsicasTest {

    @Test
    public void TestRemove() {
        GerenciadorMúsicas g = new GerenciadorMúsicas();
        g.setMúsicas(g.lerTodasASMúsicas(Paths.get("txts-tests", "50-worst-songs")));

        // removendo elemento
        Assert.assertTrue(g.removerMúsica(1114, Paths.get("txts-tests", "50-worst-songs-out")));
        Assert.assertEquals(49, g.getMúsicas().size());
        // conferindo se ta removendo elemento inexistente
        Assert.assertFalse(g.removerMúsica(1114, Paths.get("txts-tests", "50-worst-songs-out")));
        Assert.assertEquals(49, g.getMúsicas().size());

        // removendo elemento
        Assert.assertTrue(g.removerMúsica(1860, Paths.get("txts-tests", "50-worst-songs-out")));
        Assert.assertEquals(48, g.getMúsicas().size());
        // conferindo se ta removendo elemento inexistente
        Assert.assertFalse(g.removerMúsica(1860, Paths.get("txts-tests", "50-worst-songs-out")));
        Assert.assertEquals(48, g.getMúsicas().size());
    }
}
