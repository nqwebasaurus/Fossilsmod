package fossils.fossils.client.blockentity.model.arizonasaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class ArizonasaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart basin;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart chest;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart upperarm2;
	private final ModelPart lowerarm2;
	private final ModelPart hand4;
	private final ModelPart hand2;
	private final ModelPart upperarm3;
	private final ModelPart lowerarm3;
	private final ModelPart hand3;
	private final ModelPart hand5;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart tail7;
	private final ModelPart tail8;
	private final ModelPart tail9;
	private final ModelPart upperleg1;
	private final ModelPart lowerleg1;
	private final ModelPart feet1;
	private final ModelPart toes1;
	private final ModelPart upperleg2;
	private final ModelPart lowerleg2;
	private final ModelPart feet2;
	private final ModelPart toes2;
	private final ModelPart bone2;
	private final ModelPart bone4;

	public ArizonasaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.basin = this.root.getChild("basin");
		this.body = this.basin.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.chest = this.body3.getChild("chest");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.head1 = this.neck5.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.leftFace = this.head1.getChild("leftFace");
		this.rightFace = this.head1.getChild("rightFace");
		this.upperarm2 = this.chest.getChild("upperarm2");
		this.lowerarm2 = this.upperarm2.getChild("lowerarm2");
		this.hand4 = this.lowerarm2.getChild("hand4");
		this.hand2 = this.hand4.getChild("hand2");
		this.upperarm3 = this.chest.getChild("upperarm3");
		this.lowerarm3 = this.upperarm3.getChild("lowerarm3");
		this.hand3 = this.lowerarm3.getChild("hand3");
		this.hand5 = this.hand3.getChild("hand5");
		this.bone = this.chest.getChild("bone");
		this.bone3 = this.chest.getChild("bone3");
		this.tail1 = this.basin.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.tail7 = this.tail6.getChild("tail7");
		this.tail8 = this.tail7.getChild("tail8");
		this.tail9 = this.tail8.getChild("tail9");
		this.upperleg1 = this.basin.getChild("upperleg1");
		this.lowerleg1 = this.upperleg1.getChild("lowerleg1");
		this.feet1 = this.lowerleg1.getChild("feet1");
		this.toes1 = this.feet1.getChild("toes1");
		this.upperleg2 = this.basin.getChild("upperleg2");
		this.lowerleg2 = this.upperleg2.getChild("lowerleg2");
		this.feet2 = this.lowerleg2.getChild("feet2");
		this.toes2 = this.feet2.getChild("toes2");
		this.bone2 = this.basin.getChild("bone2");
		this.bone4 = this.basin.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -27.0F, 2.7F, 1.0F, 27.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-3.9F, -4.7F, -0.5F, 1.0F, 9.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.6F, -21.1F, -19.0F, 0.4363F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-1.075F, -2.9F, -0.5F, 1.0F, 24.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(4.6F, -21.1F, -19.0F, 0.0F, -0.4363F, 0.0F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(1, 1).addBox(8.7F, -3.5F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -16.5F, 3.2F, 0.0F, 0.0F, -1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition basin = root.addOrReplaceChild("basin", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, -4.3665F, 3.8611F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r4 = basin.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 36).addBox(0.3F, 0.9256F, -0.2298F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -0.6107F, -3.9205F, -0.0873F, 0.0F, 0.0F));

		PartDefinition body = basin.addOrReplaceChild("body", CubeListBuilder.create().texOffs(50, 16).addBox(-0.25F, 0.5062F, -7.9294F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(56, 22).addBox(-0.25F, 0.5062F, -1.2294F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1728F, -3.7062F, -0.0088F, -0.1309F, 0.0011F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create().texOffs(50, 26).addBox(-0.9F, 0.4626F, -7.3909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.6F, -0.0314F, -7.2386F, 0.1226F, -0.0866F, -0.0107F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create().texOffs(67, 20).addBox(-0.9F, 0.4626F, -5.1909F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0084F, -6.945F, 0.1572F, -0.0431F, -0.0068F));

		PartDefinition chest = body3.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.808F, -4.8842F, -0.1402F, -0.0864F, 0.0122F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(20, 62).addBox(-0.5F, -1.9F, -6.5F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(15, 57).addBox(-0.5F, -1.9F, -5.8F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 1.5742F, 0.0677F, 0.0698F, 0.0F, 0.0F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create().texOffs(7, 92).addBox(-0.475F, -0.0306F, -2.9405F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1199F, -5.902F, 0.0521F, -0.167F, -0.0977F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, -2.9577F, -0.2956F, 0.0F, 0.0F));

		PartDefinition cube_r6 = neck2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(82, 65).addBox(0.025F, 0.6F, 6.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(79, 62).addBox(0.025F, 0.6F, 2.6F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, 0.7561F, -6.8926F, 0.2094F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.0451F, -3.9942F, 0.0767F, -0.1743F, 0.0094F));

		PartDefinition cube_r7 = neck3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 79).addBox(0.05F, -0.3F, -0.575F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.4012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.75F, 0.4829F, -3.8726F, 0.0471F, -0.2241F, 0.0174F));

		PartDefinition cube_r8 = neck4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(89, 70).addBox(0.1F, -0.3F, 0.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.7311F, 1.3784F, -3.179F, 0.1222F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7311F, 0.4613F, -2.8101F, 0.0863F, 0.0F, 0.0F));

		PartDefinition cube_r9 = neck5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(73, 89).addBox(0.1F, -0.3F, 0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.3012F, -3.3445F, 0.1222F, 0.0F, 0.0F));

		PartDefinition head1 = neck5.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.52F, 0.4536F, -2.8297F, 0.7913F, 0.0F, 0.0F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, 2.7463F, 0.2422F, 0.2618F, 0.0083F, -0.0026F));

		PartDefinition leftFace = head1.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.846F, -0.2862F, -5.9806F, -0.3054F, 0.0F, 0.0F));

		PartDefinition rightFace = head1.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.686F, -0.2862F, -5.9806F, -0.3054F, 0.0F, 0.0F));

		PartDefinition upperarm2 = chest.addOrReplaceChild("upperarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(4.393F, 5.5624F, -2.2635F, -0.1147F, 0.4724F, 0.1166F));

		PartDefinition lowerarm2 = upperarm2.addOrReplaceChild("lowerarm2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3275F, 6.7637F, 5.1003F, 0.349F, 0.922F, 0.1903F));

		PartDefinition hand4 = lowerarm2.addOrReplaceChild("hand4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1821F, 10.0057F, -1.1202F, 0.1207F, -0.1358F, -0.9464F));

		PartDefinition hand2 = hand4.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8736F, 1.7231F, -0.1549F, 0.0F, 0.0F, -0.2618F));

		PartDefinition upperarm3 = chest.addOrReplaceChild("upperarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.1931F, 5.5624F, -2.2635F, -0.6983F, -0.547F, 0.3595F));

		PartDefinition lowerarm3 = upperarm3.addOrReplaceChild("lowerarm3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3275F, 6.7637F, 5.1003F, 0.349F, -0.922F, -0.1903F));

		PartDefinition hand3 = lowerarm3.addOrReplaceChild("hand3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1821F, 10.0057F, -1.1202F, 0.1207F, 0.1358F, 0.9464F));

		PartDefinition hand5 = hand3.addOrReplaceChild("hand5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8736F, 1.7231F, -0.1549F, 0.0F, 0.0F, 0.2618F));

		PartDefinition bone = chest.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.5638F, 2.7758F, -1.7741F, 0.0F, -0.1309F, 0.0F));

		PartDefinition bone3 = chest.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3638F, 2.7758F, -1.7741F, 0.0F, 0.1309F, 0.0F));

		PartDefinition tail1 = basin.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(0, 57).addBox(-0.45F, 1.0478F, -0.3335F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.25F, 0.054F, 4.1231F, -0.3395F, 0.0823F, -0.029F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.9319F, 5.9558F, -0.0388F, 0.0434F, -0.0055F));

		PartDefinition cube_r10 = tail2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(45, 43).addBox(-0.5F, -1.8F, 8.25F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(45, 43).addBox(-0.5F, -1.8F, 7.55F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 36).addBox(-0.5F, -1.8F, -0.15F, 1.0F, 2.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.05F, 0.9149F, -0.466F, 0.0513F, -0.0046F, -0.0069F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 47).addBox(-0.55F, 0.1797F, 0.1283F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.5021F, 7.9978F, 0.0675F, 0.175F, 0.0231F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 0).addBox(-0.575F, 0.2668F, 0.0643F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.067F, 7.6106F, 0.0267F, 0.2617F, 0.0331F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 13).addBox(-0.55F, 0.2668F, -0.3107F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.037F, 10.8959F, 0.098F, -0.1749F, 0.014F));

		PartDefinition cube_r11 = tail5.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(10, 23).addBox(-0.825F, -0.5F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.275F, 0.7668F, 10.5393F, 0.0F, -0.1745F, 0.0F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(25, 0).addBox(-0.55F, 0.3419F, 0.0393F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.037F, 10.8959F, 0.0884F, -0.3038F, 0.0068F));

		PartDefinition tail7 = tail6.addOrReplaceChild("tail7", CubeListBuilder.create().texOffs(57, 36).addBox(-0.55F, 0.3418F, -0.4607F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(61, 40).addBox(-0.55F, 0.3418F, 5.2393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0373F, 10.9716F, 0.1329F, -0.2146F, -0.0211F));

		PartDefinition tail8 = tail7.addOrReplaceChild("tail8", CubeListBuilder.create().texOffs(19, 47).addBox(-0.55F, 0.3668F, -0.2607F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 54).addBox(-0.55F, 0.3668F, 7.4393F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.001F, 5.9263F, 0.2047F, -0.2137F, -0.044F));

		PartDefinition tail9 = tail8.addOrReplaceChild("tail9", CubeListBuilder.create().texOffs(57, 44).addBox(-0.55F, 0.3668F, -0.1607F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0039F, 8.0025F, 0.1502F, -0.3887F, -0.0573F));

		PartDefinition upperleg1 = basin.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4F, 3.1722F, -0.7905F, 0.0698F, 0.0F, 0.0F));

		PartDefinition lowerleg1 = upperleg1.addOrReplaceChild("lowerleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 11.8659F, -5.3286F, 0.2269F, 0.0F, 0.0F));

		PartDefinition feet1 = lowerleg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 12.1324F, 0.6641F, -1.8853F, 0.0F, 0.0F));

		PartDefinition toes1 = feet1.addOrReplaceChild("toes1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9702F, 1.4153F, 1.5727F, 0.0F, 0.0F));

		PartDefinition upperleg2 = basin.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0F, 3.1722F, -0.7905F, 0.637F, 0.0F, 0.0F));

		PartDefinition lowerleg2 = upperleg2.addOrReplaceChild("lowerleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 11.8659F, -5.3286F, 0.1396F, 0.0F, 0.0F));

		PartDefinition feet2 = lowerleg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 12.1324F, 0.6641F, -1.4926F, 0.0F, 0.0F));

		PartDefinition toes2 = feet2.addOrReplaceChild("toes2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9702F, 1.4153F, 0.7001F, 0.0F, 0.0F));

		PartDefinition bone2 = basin.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.311F, 5.167F, 0.0452F, 0.0F, -0.0087F, 0.0524F));

		PartDefinition bone4 = basin.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.911F, 5.167F, 0.0452F, 0.0F, 0.0087F, -0.0524F));

		return LayerDefinition.create(meshdefinition, 138, 138);
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