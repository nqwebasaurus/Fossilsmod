package fossils.fossils.client.blockentity.model.necrolestes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class NecrolestesFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart hips;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart upperleg3;
	private final ModelPart leg3;
	private final ModelPart feet3;
	private final ModelPart toes3;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart UpperArmL;
	private final ModelPart LowerArmL;
	private final ModelPart HandL;
	private final ModelPart HandL2;
	private final ModelPart UpperArmL2;
	private final ModelPart LowerArmL2;
	private final ModelPart HandL3;
	private final ModelPart HandL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart neck3;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail7;
	private final ModelPart tail2;

	public NecrolestesFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.hips = this.fossil.getChild("hips");
		this.bone = this.hips.getChild("bone");
		this.bone3 = this.hips.getChild("bone3");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.upperleg3 = this.hips.getChild("upperleg3");
		this.leg3 = this.upperleg3.getChild("leg3");
		this.feet3 = this.leg3.getChild("feet3");
		this.toes3 = this.feet3.getChild("toes3");
		this.body = this.hips.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.UpperArmL = this.chest.getChild("UpperArmL");
		this.LowerArmL = this.UpperArmL.getChild("LowerArmL");
		this.HandL = this.LowerArmL.getChild("HandL");
		this.HandL2 = this.HandL.getChild("HandL2");
		this.UpperArmL2 = this.chest.getChild("UpperArmL2");
		this.LowerArmL2 = this.UpperArmL2.getChild("LowerArmL2");
		this.HandL3 = this.LowerArmL2.getChild("HandL3");
		this.HandL4 = this.HandL3.getChild("HandL4");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.neck3 = this.chest.getChild("neck3");
		this.neck2 = this.neck3.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.hips.getChild("tail");
		this.tail7 = this.tail.getChild("tail7");
		this.tail2 = this.tail7.getChild("tail2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -8.6F, 9.0F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(4.4F, -3.6F, -0.5F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-1.8F, -10.0F, -15.1F, 0.1309F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-1.1F, 1.0F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(-1.8F, -10.0F, -15.1F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(4.1F, -2.5F, -0.5F, 1.0F, 6.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -12.5F, 9.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition hips = fossil.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -10.3142F, 8.6479F, -0.4712F, 0.0F, 0.0F));

		PartDefinition cube_r4 = hips.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.75F, 0.25F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, -0.0524F, 0.0F, 0.0F));

		PartDefinition bone = hips.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3564F, 1.2032F, 0.6971F, 0.1402F, -0.1664F, 1.3046F));

		PartDefinition bone3 = hips.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3564F, 1.2032F, 0.6971F, 0.1402F, 0.1664F, -1.3046F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.5092F, 1.8047F, 2.1423F, -0.9087F, 0.4053F, -1.1867F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0663F, 6.3087F, -0.5407F, 1.4785F, -1.295F, 0.3769F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1632F, 6.5492F, 0.0815F, -0.1212F, -0.0415F, -0.0973F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4229F, -2.7873F, -0.261F, 0.0048F, 0.0107F));

		PartDefinition upperleg3 = hips.addOrReplaceChild("upperleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5092F, 1.8047F, 2.1423F, -0.6936F, -0.507F, 1.0948F));

		PartDefinition leg3 = upperleg3.addOrReplaceChild("leg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0663F, 6.3087F, -0.5407F, 1.5658F, 1.295F, -0.3769F));

		PartDefinition feet3 = leg3.addOrReplaceChild("feet3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1632F, 6.5492F, 0.0815F, -0.4323F, 0.0522F, 0.0395F));

		PartDefinition toes3 = feet3.addOrReplaceChild("toes3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4229F, -2.7873F, -0.261F, -0.0048F, -0.0107F));

		PartDefinition body = hips.addOrReplaceChild("body", CubeListBuilder.create().texOffs(21, 5).addBox(-0.5F, 0.8242F, -5.2384F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(25, 9).addBox(-0.5F, 0.8242F, -0.7384F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.2F, -3.0F, 0.2705F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(13, 25).addBox(-0.5F, 0.4F, -5.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3992F, -4.9384F, 0.1839F, 0.0858F, 0.0159F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(0, 17).addBox(-0.5F, 0.6989F, -6.0261F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3F, -5.0F, 0.262F, 0.0421F, 0.0113F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0708F, 0.1432F, -6.0884F, -0.1264F, 0.0255F, -0.012F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(27, 40).addBox(-0.5898F, 0.9395F, 6.5118F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(24, 37).addBox(-0.5898F, 0.9395F, 2.8118F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0042F, 1.0055F, -7.1239F, 0.192F, 0.0F, 0.0F));

		PartDefinition UpperArmL = chest.addOrReplaceChild("UpperArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2593F, 4.6812F, -6.7385F, 0.8966F, 0.1485F, -0.7888F));

		PartDefinition LowerArmL = UpperArmL.addOrReplaceChild("LowerArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6658F, 6.0812F, -0.1323F, -1.9086F, 0.2248F, 0.6413F));

		PartDefinition HandL = LowerArmL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0939F, 3.2383F, 0.7319F, 1.435F, -0.1733F, 0.0837F));

		PartDefinition HandL2 = HandL.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.6087F, -1.9028F, -0.3578F, 0.0F, 0.0F));

		PartDefinition UpperArmL2 = chest.addOrReplaceChild("UpperArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4009F, 4.6812F, -6.7385F, 0.4937F, -0.0788F, 1.0452F));

		PartDefinition LowerArmL2 = UpperArmL2.addOrReplaceChild("LowerArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6658F, 6.0812F, -0.1323F, -1.6481F, 0.0896F, -1.1135F));

		PartDefinition HandL3 = LowerArmL2.addOrReplaceChild("HandL3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0939F, 3.2383F, 0.7319F, 1.3072F, 0.0891F, -0.0607F));

		PartDefinition HandL4 = HandL3.addOrReplaceChild("HandL4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.6087F, -1.9028F, -0.0087F, 0.0F, 0.0F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0999F, 2.0642F, -3.4983F, -0.0435F, 0.0038F, 0.0872F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.2414F, 2.0642F, -3.4983F, -0.0435F, -0.0038F, -0.0872F));

		PartDefinition neck3 = chest.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0042F, 1.3341F, -3.717F, 0.0088F, 0.1309F, 0.0011F));

		PartDefinition cube_r6 = neck3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(53, 67).addBox(-0.0648F, -1.0046F, 2.876F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck2 = neck3.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.25F, -1.975F, -0.4152F, 0.3215F, -0.1384F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(44, 58).addBox(-0.0648F, -1.1046F, 4.476F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(43, 57).addBox(-0.0648F, -1.1046F, 1.776F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 1.5869F, -4.8009F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0039F, -0.0423F, -2.8208F, 0.7296F, 0.0067F, 0.1232F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.1277F, 2.2692F, -9.2683F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-0.2532F, 2.2692F, -9.2683F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9287F, -0.8651F, -3.5949F, 1.5967F, 0.0044F, -0.0057F));

		PartDefinition tail = hips.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(16, 50).addBox(-0.5F, 0.3219F, 1.9037F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.2726F, 0.5817F, 2.9695F, -0.0264F, -0.1309F, 0.0034F));

		PartDefinition tail7 = tail.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(0, 25).addBox(-0.55F, -0.2731F, -0.5611F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F))
				.texOffs(4, 29).addBox(-0.55F, -0.2731F, 4.139F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5469F, 5.0037F, 0.2464F, -0.127F, -0.0318F));

		PartDefinition tail2 = tail7.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, 17).addBox(-0.55F, -0.2601F, -0.2987F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0022F, 4.8599F, 0.2768F, -0.2101F, -0.0592F));

		return LayerDefinition.create(meshdefinition, 102, 102);
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