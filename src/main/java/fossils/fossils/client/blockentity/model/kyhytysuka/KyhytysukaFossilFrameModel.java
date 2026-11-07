package fossils.fossils.client.blockentity.model.kyhytysuka;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class KyhytysukaFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Kyhytysuka;
	private final ModelPart Body1;
	private final ModelPart Body2;
	private final ModelPart ForelimbL;
	private final ModelPart ForelimbL2;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart Body3;
	private final ModelPart Body10;
	private final ModelPart Body11;
	private final ModelPart Body4;
	private final ModelPart bone;
	private final ModelPart bone4;
	private final ModelPart HindlimbL;
	private final ModelPart HindlimbL2;
	private final ModelPart Body5;
	private final ModelPart Body12;
	private final ModelPart Body13;
	private final ModelPart Body14;
	private final ModelPart Body15;
	private final ModelPart Body7;
	private final ModelPart Body8;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;

	public KyhytysukaFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Kyhytysuka = this.fossil.getChild("Kyhytysuka");
		this.Body1 = this.Kyhytysuka.getChild("Body1");
		this.Body2 = this.Body1.getChild("Body2");
		this.ForelimbL = this.Body2.getChild("ForelimbL");
		this.ForelimbL2 = this.Body2.getChild("ForelimbL2");
		this.bone2 = this.Body2.getChild("bone2");
		this.bone3 = this.Body2.getChild("bone3");
		this.Body3 = this.Body2.getChild("Body3");
		this.Body10 = this.Body3.getChild("Body10");
		this.Body11 = this.Body10.getChild("Body11");
		this.Body4 = this.Body11.getChild("Body4");
		this.bone = this.Body4.getChild("bone");
		this.bone4 = this.Body4.getChild("bone4");
		this.HindlimbL = this.Body4.getChild("HindlimbL");
		this.HindlimbL2 = this.Body4.getChild("HindlimbL2");
		this.Body5 = this.Body4.getChild("Body5");
		this.Body12 = this.Body5.getChild("Body12");
		this.Body13 = this.Body12.getChild("Body13");
		this.Body14 = this.Body13.getChild("Body14");
		this.Body15 = this.Body14.getChild("Body15");
		this.Body7 = this.Body15.getChild("Body7");
		this.Body8 = this.Body7.getChild("Body8");
		this.Head = this.Kyhytysuka.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Kyhytysuka = fossil.addOrReplaceChild("Kyhytysuka", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -11.3174F, 0.6575F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Body1 = Kyhytysuka.addOrReplaceChild("Body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6842F, -18.4109F, -0.0266F, -0.0867F, 0.0099F));

		PartDefinition cube_r1 = Body1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(43, 56).addBox(-0.5F, 0.2F, -3.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.0842F, 3.3359F, 0.3491F, 0.0F, 0.0F));

		PartDefinition Body2 = Body1.addOrReplaceChild("Body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.826F, 4.7368F, 0.0175F, -0.0873F, -0.0015F));

		PartDefinition cube_r2 = Body2.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(44, 45).addBox(-1.5F, 0.6247F, 6.3944F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(38, 39).addBox(-1.5F, 0.6247F, -0.3056F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.8582F, 2.6741F, 0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Body2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(35, 36).addBox(-4.2F, -0.5F, -5.0F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.7383F, 2.6991F, -1.5708F, 0.1396F, -1.5708F));

		PartDefinition cube_r4 = Body2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(38, 39).addBox(-1.5F, -0.8753F, -0.3056F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(1.0F, 0.6272F, 1.8829F, -1.4312F, 0.0F, 0.0F));

		PartDefinition cube_r5 = Body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(79, 38).addBox(-1.5F, 0.65F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.1582F, -0.2259F, 0.2443F, 0.0F, 0.0F));

		PartDefinition ForelimbL = Body2.addOrReplaceChild("ForelimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(5.0987F, 7.1823F, 3.2788F, 0.4247F, -0.0322F, -0.1188F));

		PartDefinition ForelimbL2 = Body2.addOrReplaceChild("ForelimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.0987F, 7.1823F, 3.2788F, 0.4247F, 0.0322F, 0.1188F));

		PartDefinition bone2 = Body2.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-1.5F, 4.7181F, 1.5697F));

		PartDefinition bone3 = Body2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(1.5F, 4.7181F, 1.5697F));

		PartDefinition Body3 = Body2.addOrReplaceChild("Body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5909F, 9.6028F, 0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r6 = Body3.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(19, 29).addBox(-1.5F, 0.7F, 0.35F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.365F, -0.0914F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body10 = Body3.addOrReplaceChild("Body10", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5541F, 7.803F, -0.131F, -0.0433F, 0.0057F));

		PartDefinition cube_r7 = Body10.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(19, 39).addBox(-1.5F, 0.65F, 0.15F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.365F, -0.0914F, -0.192F, 0.0F, 0.0F));

		PartDefinition Body11 = Body10.addOrReplaceChild("Body11", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.5393F, 7.7656F, -0.1223F, 0.0433F, -0.0053F));

		PartDefinition cube_r8 = Body11.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(7, 36).addBox(-0.8F, -0.4548F, 7.4651F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(0, 29).addBox(-0.8F, -0.4548F, -0.2349F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.3F, 0.735F, -0.0914F, -0.1964F, 0.0043F, -0.0009F));

		PartDefinition Body4 = Body11.addOrReplaceChild("Body4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3906F, 7.6977F, 0.0657F, 0.0871F, 0.0057F));

		PartDefinition cube_r9 = Body4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(75, 61).addBox(-2.5F, -0.5F, -3.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 3.6246F, 5.6318F, -1.5708F, -0.1396F, -1.5708F));

		PartDefinition cube_r10 = Body4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(78, 64).addBox(-0.5F, -1.9364F, 0.741F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(0.0F, 1.2055F, 4.5213F, -1.7104F, 0.0F, 0.0F));

		PartDefinition cube_r11 = Body4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(79, 65).addBox(-0.5F, 0.0636F, -0.059F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.2055F, 3.8213F, -0.1396F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Body4.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(59, 69).addBox(-1.5F, 0.6352F, 0.4607F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.2037F, -0.1097F, -0.2094F, 0.0F, 0.0F));

		PartDefinition bone = Body4.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(3.3F, 4.6983F, 4.405F, 0.3927F, 0.0F, 0.0F));

		PartDefinition bone4 = Body4.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3F, 4.6983F, 4.405F, 0.3927F, 0.0F, 0.0F));

		PartDefinition HindlimbL = Body4.addOrReplaceChild("HindlimbL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.4579F, 5.1194F, 4.7612F, 0.7793F, -0.4696F, 0.2265F));

		PartDefinition HindlimbL2 = Body4.addOrReplaceChild("HindlimbL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.4579F, 5.1194F, 4.7612F, 0.7793F, 0.4696F, -0.2265F));

		PartDefinition Body5 = Body4.addOrReplaceChild("Body5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.0617F, 6.7906F, 0.0894F, 0.2173F, 0.0193F));

		PartDefinition cube_r13 = Body5.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(69, 50).addBox(-1.4F, 0.725F, 3.175F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(66, 47).addBox(-1.4F, 0.725F, -0.525F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.1654F, -0.0968F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body12 = Body5.addOrReplaceChild("Body12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0725F, 3.9045F, 0.0704F, 0.1306F, 0.0092F));

		PartDefinition cube_r14 = Body12.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(36, 73).addBox(-0.5F, -0.5506F, 3.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(33, 70).addBox(-0.5F, -0.5506F, -0.2004F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.1F, 1.1114F, -0.0436F, -0.0175F, -0.0175F, 0.0003F));

		PartDefinition Body13 = Body12.addOrReplaceChild("Body13", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0612F, 3.9796F, 0.0175F, 0.0873F, 0.0015F));

		PartDefinition cube_r15 = Body13.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(67, 8).addBox(-1.5F, 0.75F, 0.2F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.1654F, -0.0968F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body14 = Body13.addOrReplaceChild("Body14", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0603F, 4.0045F, 0.035F, -0.0872F, -0.0031F));

		PartDefinition cube_r16 = Body14.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(70, 17).addBox(-0.5F, -0.5506F, 3.4996F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(67, 14).addBox(-0.5F, -0.5506F, -0.2004F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.135F, -0.119F, -0.0175F, -0.0131F, 0.0002F));

		PartDefinition Body15 = Body14.addOrReplaceChild("Body15", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0638F, 3.9046F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r17 = Body15.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(68, 38).addBox(-1.5F, 0.75F, 0.1F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(1.0F, -0.1654F, 0.0032F, -0.0175F, 0.0F, 0.0F));

		PartDefinition Body7 = Body15.addOrReplaceChild("Body7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1167F, 3.8742F, -0.1232F, -0.1299F, 0.016F));

		PartDefinition cube_r18 = Body7.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(80, 0).addBox(-0.5F, -0.534F, -0.2004F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.025F, 1.0557F, 0.1707F, -0.0262F, 0.0262F, -0.0007F));

		PartDefinition Body8 = Body7.addOrReplaceChild("Body8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0165F, 3.0478F, 0.248F, -0.1693F, -0.0426F));

		PartDefinition cube_r19 = Body8.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(86, 85).addBox(-0.5F, 0.3545F, 2.6918F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.006F, 12.0659F, 6.3633F, -0.7679F, 0.0F, 0.0F));

		PartDefinition cube_r20 = Body8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(60, 24).addBox(-0.5F, -0.1359F, 2.1634F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(58, 22).addBox(-0.5F, -0.1359F, -0.5366F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.006F, 12.0659F, 6.3633F, -0.9425F, 0.0F, 0.0F));

		PartDefinition cube_r21 = Body8.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(78, 7).addBox(-0.5F, -0.5F, -1.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.003F, 2.9247F, 1.305F, -1.0464F, 0.0529F, 0.0306F));

		PartDefinition cube_r22 = Body8.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(11, 70).addBox(-0.5F, -0.3318F, 0.0346F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.003F, 8.6237F, 3.9943F, -1.0206F, 0.0372F, 0.0228F));

		PartDefinition cube_r23 = Body8.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(34, 60).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0289F, 8.5154F, 3.3999F, -1.0996F, 0.0715F, 0.0194F));

		PartDefinition cube_r24 = Body8.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(30, 56).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.003F, 6.2058F, 2.8432F, -1.1859F, 0.0688F, 0.0278F));

		PartDefinition cube_r25 = Body8.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(89, 77).addBox(-0.5F, -0.5F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.003F, 1.3885F, 0.0592F, -0.6097F, 0.04F, 0.0572F));

		PartDefinition Head = Kyhytysuka.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0536F, 1.1196F, -18.8117F, -0.1547F, 0.0272F, 0.1724F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(0.9464F, 0.454F, -6.2482F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.0536F, 0.454F, -6.2482F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0536F, 2.5699F, 1.4567F, 1.3439F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 112, 112);
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