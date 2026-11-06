package codechicken.lib.render.buffer;

import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.resources.model.geometry.BakedQuad;
import com.mojang.blaze3d.vertex.QuadInstance;
import com.mojang.blaze3d.vertex.PoseStack;
import org.joml.Vector3fc;

/**
 * STUB(port-26.1.2): Портировать из Forge-версии.
 */
public class BakedQuadVertexBuilder implements VertexConsumer {
    @Override public VertexConsumer addVertex(float x, float y, float z) { return this; }
    @Override public VertexConsumer setColor(int r, int g, int b, int a) { return this; }
    @Override public VertexConsumer setColor(int color) { return this; }
    @Override public VertexConsumer setUv(float u, float v) { return this; }
    @Override public VertexConsumer setUv1(int u, int v) { return this; }
    @Override public VertexConsumer setUv2(int u, int v) { return this; }
    @Override public VertexConsumer setNormal(float x, float y, float z) { return this; }
    @Override public VertexConsumer setLineWidth(float width) { return this; }
    @Override public void putBlockBakedQuad(float x, float y, float z, BakedQuad quad, QuadInstance instance) {}
    @Override public void putBakedQuad(PoseStack.Pose pose, BakedQuad quad, QuadInstance instance) {}
}
