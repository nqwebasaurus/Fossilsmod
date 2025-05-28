package fossils.fossils.client.blockentity.model.sordes;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class SordesFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart main;
	private final ModelPart leftWing;
	private final ModelPart leftWing2;
	private final ModelPart leftWing3;
	private final ModelPart hand;
	private final ModelPart leftWing4;
	private final ModelPart leftWing7;
	private final ModelPart leftWing5;
	private final ModelPart leftWing6;
	private final ModelPart rightWing;
	private final ModelPart rightWing2;
	private final ModelPart rightWing3;
	private final ModelPart hand2;
	private final ModelPart rightWing4;
	private final ModelPart rightWing7;
	private final ModelPart rightWing5;
	private final ModelPart rightWing6;
	private final ModelPart leftLeg;
	private final ModelPart leftLegMembrane;
	private final ModelPart leftLeg2;
	private final ModelPart leftLeg3;
	private final ModelPart finger;
	private final ModelPart leftLeg4;
	private final ModelPart rightLeg;
	private final ModelPart rightLegMembrane;
	private final ModelPart rightLeg2;
	private final ModelPart rightLeg3;
	private final ModelPart finger2;
	private final ModelPart rightLeg4;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;

	public SordesFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.main = this.fossil.getChild("main");
		this.leftWing = this.main.getChild("leftWing");
		this.leftWing2 = this.leftWing.getChild("leftWing2");
		this.leftWing3 = this.leftWing2.getChild("leftWing3");
		this.hand = this.leftWing3.getChild("hand");
		this.leftWing4 = this.leftWing3.getChild("leftWing4");
		this.leftWing7 = this.leftWing4.getChild("leftWing7");
		this.leftWing5 = this.leftWing7.getChild("leftWing5");
		this.leftWing6 = this.leftWing5.getChild("leftWing6");
		this.rightWing = this.main.getChild("rightWing");
		this.rightWing2 = this.rightWing.getChild("rightWing2");
		this.rightWing3 = this.rightWing2.getChild("rightWing3");
		this.hand2 = this.rightWing3.getChild("hand2");
		this.rightWing4 = this.rightWing3.getChild("rightWing4");
		this.rightWing7 = this.rightWing4.getChild("rightWing7");
		this.rightWing5 = this.rightWing7.getChild("rightWing5");
		this.rightWing6 = this.rightWing5.getChild("rightWing6");
		this.leftLeg = this.main.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.main.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.neck = this.main.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.head = this.neck3.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.tail = this.main.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition main = fossil.addOrReplaceChild("main", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -13.35F, -2.5F, -0.9331F, -0.491F, 0.2602F));

		PartDefinition cube_r1 = main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(53, 30).addBox(-0.5F, 0.6996F, 1.6553F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 29).addBox(-0.5F, 0.6996F, -0.0447F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.05F, 6.4F, -0.2443F, 0.0F, 0.0F));

		PartDefinition cube_r2 = main.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(50, 27).addBox(-0.5F, -0.3F, -2.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 0.3451F, 7.0367F, -1.5708F, 1.3265F, -1.5708F));

		PartDefinition cube_r3 = main.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(39, 10).addBox(-0.5F, 0.4941F, 0.0549F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.25F, 3.5F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r4 = main.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(39, 5).addBox(-0.5F, 0.5174F, -2.8393F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3F, 3.5F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r5 = main.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(8, 61).addBox(-0.5F, 0.7982F, -0.6099F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(7, 60).addBox(-0.5F, 0.7982F, -2.3099F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.4F, 0.2705F, 0.0F, 0.0F));

		PartDefinition cube_r6 = main.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(4, 58).addBox(-2.2F, 0.8982F, -2.1099F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.4F, 1.5708F, -1.3003F, -1.5708F));

		PartDefinition cube_r7 = main.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(37, 64).addBox(-0.5F, 1.1313F, -2.6093F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.3F, 0.4F, 0.0785F, 0.0F, 0.0F));

		PartDefinition leftWing = main.addOrReplaceChild("leftWing", CubeListBuilder.create(), PartPose.offsetAndRotation(1.9063F, 0.3217F, -0.4464F, -0.1909F, 0.1119F, -2.6791F));

		PartDefinition leftWing2 = leftWing.addOrReplaceChild("leftWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2761F, 4.5344F, -0.9115F, -0.3405F, 0.0123F, -0.0407F));

		PartDefinition leftWing3 = leftWing2.addOrReplaceChild("leftWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0091F, 7.7173F, 0.165F, 0.3097F, 0.0484F, 0.1514F));

		PartDefinition hand = leftWing3.addOrReplaceChild("hand", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.437F, 2.5451F, -0.0302F, 1.124F, -0.0427F, -3.1095F));

		PartDefinition leftWing4 = leftWing3.addOrReplaceChild("leftWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1275F, 2.7906F, 0.2577F, -1.5311F, 0.5051F, 0.1059F));

		PartDefinition leftWing7 = leftWing4.addOrReplaceChild("leftWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5127F, 0.0955F, 5.428F, -0.0876F, -0.0869F, 0.0076F));

		PartDefinition leftWing5 = leftWing7.addOrReplaceChild("leftWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1582F, -0.8639F, 5.1911F, 0.0826F, -0.2075F, -0.0505F));

		PartDefinition leftWing6 = leftWing5.addOrReplaceChild("leftWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0789F, -1.2427F, 6.5469F, 0.3923F, -0.1455F, -0.0965F));

		PartDefinition rightWing = main.addOrReplaceChild("rightWing", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.9063F, 0.3217F, -0.4464F, -0.1909F, -0.1119F, 2.6791F));

		PartDefinition rightWing2 = rightWing.addOrReplaceChild("rightWing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2761F, 4.5344F, -0.9115F, -0.3405F, -0.0123F, 0.0407F));

		PartDefinition rightWing3 = rightWing2.addOrReplaceChild("rightWing3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0091F, 7.7173F, 0.165F, 0.3097F, -0.0484F, -0.1514F));

		PartDefinition hand2 = rightWing3.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.437F, 2.5451F, -0.0302F, 1.124F, 0.0427F, 3.1095F));

		PartDefinition rightWing4 = rightWing3.addOrReplaceChild("rightWing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1275F, 2.7906F, 0.2577F, -1.5311F, -0.5051F, -0.1059F));

		PartDefinition rightWing7 = rightWing4.addOrReplaceChild("rightWing7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5127F, 0.0955F, 5.428F, -0.0876F, 0.0869F, -0.0076F));

		PartDefinition rightWing5 = rightWing7.addOrReplaceChild("rightWing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1582F, -0.8639F, 5.1911F, 0.0826F, 0.2075F, 0.0505F));

		PartDefinition rightWing6 = rightWing5.addOrReplaceChild("rightWing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0789F, -1.2427F, 6.5469F, 0.3923F, 0.1455F, 0.0965F));

		PartDefinition leftLeg = main.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.8529F, 0.2138F, 7.2672F, 0.9165F, -0.2135F, -1.4312F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(-0.4709F, 0.8445F, 1.536F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0088F, 4.9225F, -0.4113F, 0.7862F, 0.2565F, 0.1924F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.536F, 5.647F, 0.3961F, 0.3246F, 0.1579F, -0.1753F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0F, 0.5F, 0.3F, -1.0578F, 0.4084F, -1.1074F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0133F, -2.6149F, 0.4632F, 0.0F, 0.0F));

		PartDefinition rightLeg = main.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8529F, 0.2138F, 7.2672F, 0.9165F, 0.2135F, 1.4312F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.4709F, 0.8445F, 1.536F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0088F, 4.9225F, -0.4113F, 0.7862F, -0.2565F, -0.1924F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.536F, 5.647F, 0.3961F, 0.3246F, -0.1579F, 0.1753F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0F, 0.5F, 0.3F, -1.0578F, -0.4084F, 1.1074F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0133F, -2.6149F, 0.4632F, 0.0F, 0.0F));

		PartDefinition neck = main.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.05F, -2.15F, -0.0655F, -0.0268F, 0.1725F));

		PartDefinition cube_r8 = neck.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(53, 34).addBox(-0.5F, -0.32F, -0.8396F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(52, 33).addBox(-0.5F, -0.32F, -2.5396F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1204F, 0.3666F, 0.2294F, 0.1755F, 0.1031F, 0.0182F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4682F, -1.7841F, -0.1353F, 0.4292F, 0.0181F));

		PartDefinition cube_r9 = neck2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(29, 38).addBox(-0.5F, -0.1782F, -1.7438F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1888F, -1.1666F, 0.0349F, 0.0F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, -3.0F, -0.4608F, 0.1393F, 0.2727F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(20, 43).addBox(-0.5F, -0.2F, -0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.7972F, -1.7905F, 0.5504F, 0.0446F, 0.0274F));

		PartDefinition head = neck3.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3708F, -2.1222F, 1.0515F, 0.0F, 0.0F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3096F, -1.5862F, 0.4538F, 0.0F, 0.0F));

		PartDefinition tail = main.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(0, 21).addBox(-0.5F, 0.2412F, 0.0042F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0945F, 8.1607F, -0.0661F, -0.3919F, 0.0253F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(17, 29).addBox(-0.5F, 0.3037F, -0.7041F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(21, 33).addBox(-0.5F, 0.3037F, 4.2959F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.153F)), PartPose.offsetAndRotation(0.0F, -0.05F, 7.025F, 0.2708F, -0.4346F, -0.0406F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.3037F, -0.4041F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F))
				.texOffs(9, 9).addBox(-0.5F, 0.3037F, 9.2959F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.9F, 0.2985F, -0.5637F, -0.0665F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 30).addBox(-0.5F, 0.3037F, -0.3041F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 10.0F, 0.1604F, -0.3882F, -0.0611F));

		return LayerDefinition.create(meshdefinition, 77, 77);
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