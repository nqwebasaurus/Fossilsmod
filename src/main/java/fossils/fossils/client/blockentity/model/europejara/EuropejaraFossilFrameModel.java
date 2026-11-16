package fossils.fossils.client.blockentity.model.europejara;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class EuropejaraFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest1;
	private final ModelPart neck1;
	private final ModelPart neck5;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart head;
	private final ModelPart jaw;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing6;
	private final ModelPart leftwing7;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart righthand2;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing6;
	private final ModelPart rightwing7;
	private final ModelPart body;
	private final ModelPart body2;
	private final ModelPart body3;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart leftleg1;
	private final ModelPart leftleg2;
	private final ModelPart leftfoot;
	private final ModelPart leftlegwing2;
	private final ModelPart leftlegwing1;
	private final ModelPart rightleg1;
	private final ModelPart rightleg2;
	private final ModelPart rightfoot;
	private final ModelPart rightlegwing2;
	private final ModelPart rightlegwing1;
	private final ModelPart bone2;
	private final ModelPart bone3;
	private final ModelPart bone;
	private final ModelPart bone4;

	public EuropejaraFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest1 = this.root.getChild("chest1");
		this.neck1 = this.chest1.getChild("neck1");
		this.neck5 = this.neck1.getChild("neck5");
		this.neck = this.neck5.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.head = this.neck4.getChild("head");
		this.jaw = this.head.getChild("jaw");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.leftwing1 = this.chest1.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.lefthand2 = this.leftwing3.getChild("lefthand2");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing6 = this.leftwing5.getChild("leftwing6");
		this.leftwing7 = this.leftwing6.getChild("leftwing7");
		this.rightwing1 = this.chest1.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.righthand2 = this.rightwing3.getChild("righthand2");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing6 = this.rightwing5.getChild("rightwing6");
		this.rightwing7 = this.rightwing6.getChild("rightwing7");
		this.body = this.chest1.getChild("body");
		this.body2 = this.body.getChild("body2");
		this.body3 = this.body2.getChild("body3");
		this.body1 = this.body3.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.leftleg1 = this.body1.getChild("leftleg1");
		this.leftleg2 = this.leftleg1.getChild("leftleg2");
		this.leftfoot = this.leftleg2.getChild("leftfoot");
		this.leftlegwing2 = this.leftleg2.getChild("leftlegwing2");
		this.leftlegwing1 = this.leftleg1.getChild("leftlegwing1");
		this.rightleg1 = this.body1.getChild("rightleg1");
		this.rightleg2 = this.rightleg1.getChild("rightleg2");
		this.rightfoot = this.rightleg2.getChild("rightfoot");
		this.rightlegwing2 = this.rightleg2.getChild("rightlegwing2");
		this.rightlegwing1 = this.rightleg1.getChild("rightlegwing1");
		this.bone2 = this.body1.getChild("bone2");
		this.bone3 = this.body1.getChild("bone3");
		this.bone = this.chest1.getChild("bone");
		this.bone4 = this.chest1.getChild("bone4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -26.054F, 0.9051F, 0.2618F, 0.0F, 0.0F));

		PartDefinition chest1 = root.addOrReplaceChild("chest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0357F, -0.9945F, -4.893F, -0.1553F, 0.0F, 0.0F));

		PartDefinition cube_r1 = chest1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(59, 84).addBox(-0.5F, -0.15F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 0.687F, 1.6665F, -0.0262F, 0.0F, 0.0F));

		PartDefinition cube_r2 = chest1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(54, 79).addBox(-0.5F, -0.1F, -3.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 1.1239F, 0.8577F, 1.5708F, -1.4661F, -1.5708F));

		PartDefinition cube_r3 = chest1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(58, 83).addBox(-0.5357F, 0.3627F, 0.4852F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4212F, -0.7096F, 0.1047F, 0.0F, 0.0F));

		PartDefinition neck1 = chest1.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4982F, -0.0053F, 0.0611F, 0.0F, 0.0F));

		PartDefinition cube_r4 = neck1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(99, 26).addBox(-0.5357F, -0.2F, -0.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.5867F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck5 = neck1.addOrReplaceChild("neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4445F, -0.9867F, -0.354F, -0.1639F, 0.0602F));

		PartDefinition cube_r5 = neck5.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(68, 35).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3857F, 0.7233F, -0.1189F, 0.3065F, 0.0832F, 0.0263F));

		PartDefinition cube_r6 = neck5.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(66, 33).addBox(-0.5357F, -0.15F, -3.4F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.4F, 0.0436F, 0.0F, 0.0F));

		PartDefinition neck = neck5.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1858F, -2.7405F, 0.271F, -0.1307F, -0.0069F));

		PartDefinition cube_r7 = neck.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 72).addBox(-0.5357F, -0.1259F, -2.8266F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1044F, -0.0591F, -0.1658F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(64, 66).addBox(-0.4857F, -0.1179F, -2.9187F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6562F, -3.0807F, -0.3464F, -0.3371F, -0.0382F));

		PartDefinition cube_r8 = neck2.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(66, 68).addBox(-0.15F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.3357F, 0.7321F, -0.0687F, 0.1047F, 0.1047F, 0.0F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3553F, -2.8395F, -0.1958F, -0.017F, -0.0856F));

		PartDefinition cube_r9 = neck3.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(29, 45).addBox(-0.5F, -0.85F, -0.15F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 1.0603F, -0.4112F, 0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r10 = neck3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(28, 44).addBox(-0.5357F, 0.4F, -2.7F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.198F, -0.4517F, -0.0873F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2568F, -2.9845F, -0.1833F, 0.0F, 0.0F));

		PartDefinition cube_r11 = neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 42).addBox(-0.5357F, 0.4F, -10.3F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2033F, 5.5443F, -0.0873F, 0.0F, 0.0F));

		PartDefinition head = neck4.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.8551F, -3.9424F, 1.296F, -0.1557F, 0.0893F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0009F, 0.5062F, -3.6148F, -0.0951F, -0.0006F, -0.0013F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3693F, -10.615F, -35.8902F, 0.0F, 0.0175F, 0.0F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2979F, -10.615F, -35.8902F, 0.0F, -0.0175F, 0.0F));

		PartDefinition leftwing1 = chest1.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(3.2854F, 1.964F, 0.8541F, -0.5446F, -0.2974F, -0.1754F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(5.421F, 0.1216F, -1.5663F, -1.8452F, 0.8126F, 2.8681F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2319F, 11.5657F, -0.1906F, -0.1135F, 0.0825F, 0.4156F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0596F, 11.2678F, 0.3805F, -1.6453F, 0.091F, -0.248F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8355F, 10.7323F, 0.6226F, 1.6858F, -0.0127F, -2.8752F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6304F, 0.1112F, 17.265F, 0.2673F, 0.2266F, 0.5677F));

		PartDefinition leftwing6 = leftwing5.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1438F, 0.0503F, 11.7254F, 0.2819F, 0.1054F, -0.0148F));

		PartDefinition leftwing7 = leftwing6.addOrReplaceChild("leftwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.082F, -0.3354F, 8.8757F, 0.0886F, 0.2178F, 0.0078F));

		PartDefinition rightwing1 = chest1.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.3569F, 1.964F, 0.8541F, -0.2869F, 0.2486F, 0.6182F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.421F, 0.0216F, -1.5663F, -1.5808F, -1.1923F, -2.9866F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2319F, 11.5657F, -0.1906F, -0.133F, -0.0447F, -0.1119F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0596F, 11.2678F, -0.0195F, -1.9581F, -0.4602F, 0.3172F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8355F, 10.7323F, 0.2226F, 1.7544F, -0.5297F, 2.7762F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6304F, 0.1112F, 17.265F, 0.2654F, -0.1636F, -0.6823F));

		PartDefinition rightwing6 = rightwing5.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1438F, 0.0503F, 11.7254F, 0.1965F, -0.2029F, 0.0154F));

		PartDefinition rightwing7 = rightwing6.addOrReplaceChild("rightwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.082F, -0.3354F, 8.8757F, 0.0886F, -0.2178F, -0.0078F));

		PartDefinition body = chest1.addOrReplaceChild("body", CubeListBuilder.create().texOffs(55, 29).addBox(-0.5357F, 0.1919F, 0.2316F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3212F, 1.9887F, -0.1047F, 0.0F, 0.0F));

		PartDefinition body2 = body.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1157F, 3.8999F, -0.0175F, 0.0F, 0.0F));

		PartDefinition cube_r12 = body2.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(49, 67).addBox(-0.5357F, 0.6826F, 0.1068F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body3 = body2.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2457F, 2.9524F, -0.0524F, 0.0F, 0.0F));

		PartDefinition cube_r13 = body3.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(45, 84).addBox(-0.5357F, 0.7076F, 1.5568F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(44, 83).addBox(-0.5357F, 0.7076F, -0.1432F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, 0.0F, -0.0872F, 0.0012F, -0.0018F));

		PartDefinition body1 = body3.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0819F, 2.0442F, -0.1279F, 0.0F, 0.0F));

		PartDefinition cube_r14 = body1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(41, 35).addBox(-0.8F, -1.1F, -2.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.0357F, 1.1673F, 3.1955F, -1.5708F, 0.0349F, 1.5708F));

		PartDefinition cube_r15 = body1.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(40, 34).addBox(-0.5357F, 0.6F, -3.125F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0723F, 3.3588F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(10, 44).addBox(-0.5607F, 0.1222F, -0.1329F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6441F, 5.9475F, -0.1034F, 0.3039F, -0.031F));

		PartDefinition leftleg1 = body1.addOrReplaceChild("leftleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.2515F, 1.0239F, 3.8786F, 0.5545F, 0.2295F, -1.1644F));

		PartDefinition leftleg2 = leftleg1.addOrReplaceChild("leftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9668F, 7.8188F, 0.9541F, 0.9178F, 0.0609F, 0.2316F));

		PartDefinition leftfoot = leftleg2.addOrReplaceChild("leftfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6888F, 12.9944F, 1.0558F, 0.7187F, 0.1795F, -0.1046F));

		PartDefinition leftlegwing2 = leftleg2.addOrReplaceChild("leftlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition leftlegwing1 = leftleg1.addOrReplaceChild("leftlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition rightleg1 = body1.addOrReplaceChild("rightleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.323F, 1.0239F, 3.8786F, 0.8603F, -0.3369F, 0.9984F));

		PartDefinition rightleg2 = rightleg1.addOrReplaceChild("rightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9668F, 7.8188F, 0.9541F, 0.6997F, -0.0609F, -0.2316F));

		PartDefinition rightfoot = rightleg2.addOrReplaceChild("rightfoot", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6888F, 12.9944F, 1.0558F, 0.5029F, -0.0939F, 0.0874F));

		PartDefinition rightlegwing2 = rightleg2.addOrReplaceChild("rightlegwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4691F, 0.0921F, 0.4536F, -0.0141F, 0.0F, 0.0F));

		PartDefinition rightlegwing1 = rightleg1.addOrReplaceChild("rightlegwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5279F, -0.2807F, 1.0914F, 0.1367F, 0.0F, 0.0F));

		PartDefinition bone2 = body1.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(1.4F, 0.2518F, 3.2086F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone3 = body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.4715F, 0.2518F, 3.2086F, -0.1745F, 0.0F, 0.0F));

		PartDefinition bone = chest1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7781F, 0.6275F, 1.6612F, -0.0873F, 0.0F, 0.0F));

		PartDefinition bone4 = chest1.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.8496F, 0.6275F, 1.6612F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 108, 108);
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