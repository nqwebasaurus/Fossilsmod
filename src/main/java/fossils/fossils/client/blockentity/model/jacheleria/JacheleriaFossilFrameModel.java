package fossils.fossils.client.blockentity.model.jacheleria;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class JacheleriaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart body;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart upperarm1;
	private final ModelPart lowerarm1;
	private final ModelPart hand1;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand2;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart chest2;
	private final ModelPart neck2;
	private final ModelPart neck;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;

	public JacheleriaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.body = this.fossil.getChild("body");
		this.bone = this.body.getChild("bone");
		this.bone3 = this.body.getChild("bone3");
		this.upperleg1 = this.body.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.upperleg2 = this.body.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.tail = this.body.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.upperarm1 = this.chest.getChild("upperarm1");
		this.lowerarm1 = this.upperarm1.getChild("lowerarm1");
		this.hand1 = this.lowerarm1.getChild("hand1");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand2 = this.lowerarm2.getChild("hand2");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.chest2 = this.chest.getChild("chest2");
		this.neck2 = this.chest2.getChild("neck2");
		this.neck = this.neck2.getChild("neck");
		this.head = this.neck.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -12.0F, 11.6F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-2.0F, -5.5F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.6F, -11.0F, -7.5F, -0.1745F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.55F, -4.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.6F, -11.0F, -7.5F, 0.0F, 0.1745F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-3.5F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -12.5F, 12.1F, 0.0F, 0.0F, -1.5708F));

		PartDefinition body = fossil.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -14.0196F, 10.9544F, -0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r4 = body.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(29, 25).addBox(-3.0F, 0.6855F, 3.157F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F))
				.texOffs(26, 22).addBox(-3.0F, 0.6855F, -0.243F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(2.5F, 0.2921F, 1.9519F, -0.3229F, 0.0F, 0.0F));

		PartDefinition cube_r5 = body.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(37, 23).addBox(-0.5F, 0.6879F, -0.0713F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3981F, -0.9128F, -0.2356F, 0.0F, 0.0F));

		PartDefinition bone = body.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3853F, 3.1946F, 3.319F, 0.0F, 0.0F, 0.1745F));

		PartDefinition bone3 = body.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3853F, 3.1946F, 3.319F, 0.0F, 0.0F, -0.1745F));

		PartDefinition upperleg1 = body.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9338F, 3.5043F, 2.1903F, -0.5055F, 0.0404F, -0.9233F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0771F, 7.807F, 1.2578F, 1.294F, -0.4178F, 0.4542F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1327F, 4.8498F, -0.174F, -0.3905F, 0.1792F, 0.3833F));

		PartDefinition upperleg2 = body.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9338F, 3.5043F, 2.1903F, -0.3263F, 0.1812F, 0.9081F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0771F, 7.807F, 1.2578F, 1.6237F, 0.5434F, -0.4959F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1327F, 4.8498F, -0.174F, -0.6744F, -0.06F, -0.1992F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(76, 8).addBox(-0.5F, -0.0413F, -1.2234F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.9744F, 5.6003F, 1.0472F, 0.0F, 0.0F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(10, 76).addBox(-0.5F, 0.0272F, -1.7007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7957F, 0.4882F, -0.1745F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 79).addBox(-0.5F, -0.1228F, -1.7007F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 2.0F, 0.0F, -0.1745F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0269F, -0.9128F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r6 = body2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 9).addBox(-0.5F, 1.0F, 12.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3845F, -17.9557F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2355F, -5.9617F, 0.0526F, 0.0871F, 0.0046F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 1.0F, -7.125F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, 0.0F, 0.096F, 0.0F, 0.0F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.951F, -6.8189F, 0.0964F, 0.0869F, 0.0084F));

		PartDefinition cube_r8 = chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(40, 43).addBox(-0.5F, 0.6769F, 4.2302F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5F, -7.1F, 0.1658F, 0.0F, 0.0F));

		PartDefinition upperarm1 = chest.addOrReplaceChild("upperarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(4.6287F, 5.7053F, -4.5249F, 0.4429F, -0.1355F, -0.7022F));

		PartDefinition lowerarm1 = upperarm1.addOrReplaceChild("lowerarm1", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0024F, 7.7369F, 0.2664F, -1.0739F, 0.3154F, 0.4471F));

		PartDefinition hand1 = lowerarm1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7865F, 2.9843F, -1.1939F, 1.6592F, -0.0266F, 0.1809F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.6287F, 5.7053F, -4.5249F, 0.5738F, 0.1355F, 0.7022F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0024F, 7.7369F, 0.2664F, -0.5939F, -0.3154F, -0.4471F));

		PartDefinition hand2 = lowerarm2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7865F, 2.9843F, -1.1939F, 0.7865F, 0.0266F, -0.1809F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(5.3F, 16.9835F, -3.7304F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(-5.3F, 16.9835F, -3.7304F));

		PartDefinition chest2 = chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, -0.2073F, -3.0162F, 0.219F, 0.0852F, 0.0189F));

		PartDefinition cube_r9 = chest2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(11, 27).addBox(-0.5F, 0.7019F, 0.3302F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.7073F, -4.0838F, 0.1658F, 0.0F, 0.0F));

		PartDefinition neck2 = chest2.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offset(-0.5F, 1.1067F, -3.7357F));

		PartDefinition cube_r10 = neck2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(32, 65).addBox(-0.5F, 0.7052F, 4.3067F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(31, 64).addBox(-0.5F, 0.7052F, 2.6067F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.9F, -4.9F, 0.2705F, 0.0F, 0.0F));

		PartDefinition neck = neck2.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0358F, -1.6639F, -0.2986F, 0.0651F, 0.2084F));

		PartDefinition cube_r11 = neck.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 38).addBox(-0.5F, 0.6036F, 0.8822F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4723F, -3.9511F, 0.3403F, 0.0F, 0.0F));

		PartDefinition head = neck.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4584F, -2.7631F, 0.2699F, 0.5088F, -0.0932F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0371F, -0.8139F, 0.0873F, 0.0F, 0.0F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6129F, -2.004F, 0.6452F, 0.0F, 0.0524F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6129F, -2.004F, 0.6452F, 0.0F, -0.0524F, 0.0F));

		return LayerDefinition.create(meshdefinition, 94, 94);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}