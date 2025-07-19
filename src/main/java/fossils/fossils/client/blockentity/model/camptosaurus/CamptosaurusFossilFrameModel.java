package fossils.fossils.client.blockentity.model.camptosaurus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CamptosaurusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Camptosaurus;
	private final ModelPart LegL;
	private final ModelPart KneeL;
	private final ModelPart TarsalsL;
	private final ModelPart FootL;
	private final ModelPart FootL2;
	private final ModelPart LegL2;
	private final ModelPart KneeL2;
	private final ModelPart TarsalsL2;
	private final ModelPart FootL3;
	private final ModelPart FootL4;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart body2;
	private final ModelPart Body;
	private final ModelPart body3;
	private final ModelPart Chest;
	private final ModelPart chest2;
	private final ModelPart ArmL;
	private final ModelPart ElbowL;
	private final ModelPart HandL;
	private final ModelPart ArmL2;
	private final ModelPart ElbowL2;
	private final ModelPart HandL2;
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart Neck4;
	private final ModelPart Neck3;
	private final ModelPart Neck2;
	private final ModelPart Neck1;
	private final ModelPart Neck5;
	private final ModelPart Neck6;
	private final ModelPart Neck7;
	private final ModelPart Head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart Jaw;
	private final ModelPart Tail1;
	private final ModelPart Tail2;
	private final ModelPart tail;
	private final ModelPart Tail3;
	private final ModelPart Tail4;
	private final ModelPart Tail5;
	private final ModelPart Tail6;
	private final ModelPart Tail7;
	private final ModelPart Tail8;

	public CamptosaurusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Camptosaurus = this.fossil.getChild("Camptosaurus");
		this.LegL = this.Camptosaurus.getChild("LegL");
		this.KneeL = this.LegL.getChild("KneeL");
		this.TarsalsL = this.KneeL.getChild("TarsalsL");
		this.FootL = this.TarsalsL.getChild("FootL");
		this.FootL2 = this.FootL.getChild("FootL2");
		this.LegL2 = this.Camptosaurus.getChild("LegL2");
		this.KneeL2 = this.LegL2.getChild("KneeL2");
		this.TarsalsL2 = this.KneeL2.getChild("TarsalsL2");
		this.FootL3 = this.TarsalsL2.getChild("FootL3");
		this.FootL4 = this.FootL3.getChild("FootL4");
		this.bone2 = this.Camptosaurus.getChild("bone2");
		this.bone4 = this.Camptosaurus.getChild("bone4");
		this.body2 = this.Camptosaurus.getChild("body2");
		this.Body = this.body2.getChild("Body");
		this.body3 = this.Body.getChild("body3");
		this.Chest = this.body3.getChild("Chest");
		this.chest2 = this.Chest.getChild("chest2");
		this.ArmL = this.chest2.getChild("ArmL");
		this.ElbowL = this.ArmL.getChild("ElbowL");
		this.HandL = this.ElbowL.getChild("HandL");
		this.ArmL2 = this.chest2.getChild("ArmL2");
		this.ElbowL2 = this.ArmL2.getChild("ElbowL2");
		this.HandL2 = this.ElbowL2.getChild("HandL2");
		this.bone = this.chest2.getChild("bone");
		this.bone3 = this.chest2.getChild("bone3");
		this.Neck4 = this.chest2.getChild("Neck4");
		this.Neck3 = this.Neck4.getChild("Neck3");
		this.Neck2 = this.Neck3.getChild("Neck2");
		this.Neck1 = this.Neck2.getChild("Neck1");
		this.Neck5 = this.Neck1.getChild("Neck5");
		this.Neck6 = this.Neck5.getChild("Neck6");
		this.Neck7 = this.Neck6.getChild("Neck7");
		this.Head = this.Neck7.getChild("Head");
		this.leftFace = this.Head.getChild("leftFace");
		this.rightFace = this.Head.getChild("rightFace");
		this.Jaw = this.Head.getChild("Jaw");
		this.Tail1 = this.Camptosaurus.getChild("Tail1");
		this.Tail2 = this.Tail1.getChild("Tail2");
		this.tail = this.Tail2.getChild("tail");
		this.Tail3 = this.tail.getChild("Tail3");
		this.Tail4 = this.Tail3.getChild("Tail4");
		this.Tail5 = this.Tail4.getChild("Tail5");
		this.Tail6 = this.Tail5.getChild("Tail6");
		this.Tail7 = this.Tail6.getChild("Tail7");
		this.Tail8 = this.Tail7.getChild("Tail8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -28.0F, -1.5F, 1.0F, 28.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(3.3F, -5.5F, -0.5F, 1.0F, 10.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -23.5F, -1.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 1).addBox(-0.7F, -4.0F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(4.5F, -15.1F, -21.0F, 0.5117F, 0.06F, -1.6773F));

		PartDefinition cube_r3 = fossil.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 1).addBox(-1.2F, -0.5F, -0.5F, 1.0F, 20.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offsetAndRotation(4.5F, -19.5F, -21.0F, 0.0F, -0.5149F, 0.0F));

		PartDefinition Camptosaurus = fossil.addOrReplaceChild("Camptosaurus", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -28.7F, 0.0F, 0.2182F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Camptosaurus.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 34).addBox(-0.5F, -0.2092F, 4.0909F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9897F, -7.5097F, -0.096F, 0.0F, 0.0F));

		PartDefinition LegL = Camptosaurus.addOrReplaceChild("LegL", CubeListBuilder.create(), PartPose.offsetAndRotation(4.7F, 0.8182F, -1.0751F, -0.2094F, 0.0F, 0.0F));

		PartDefinition KneeL = LegL.addOrReplaceChild("KneeL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6F, 12.9232F, 2.2098F, 1.0123F, 0.0F, 0.0F));

		PartDefinition TarsalsL = KneeL.addOrReplaceChild("TarsalsL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 12.6147F, -1.9589F, -1.1781F, 0.0F, 0.0F));

		PartDefinition FootL = TarsalsL.addOrReplaceChild("FootL", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 4.6135F, -0.4366F, 1.0996F, 0.0F, 0.0F));

		PartDefinition FootL2 = FootL.addOrReplaceChild("FootL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -0.8203F, 0.0F, 0.0F));

		PartDefinition LegL2 = Camptosaurus.addOrReplaceChild("LegL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.7F, 0.8182F, -1.0751F, -0.9076F, 0.0F, 0.0F));

		PartDefinition KneeL2 = LegL2.addOrReplaceChild("KneeL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6F, 12.9232F, 2.2098F, 1.3598F, 0.0162F, -0.0017F));

		PartDefinition TarsalsL2 = KneeL2.addOrReplaceChild("TarsalsL2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 12.6147F, -1.9589F, -0.6981F, 0.0F, 0.0F));

		PartDefinition FootL3 = TarsalsL2.addOrReplaceChild("FootL3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 4.6135F, -0.4366F, 0.1478F, 0.0F, 0.0F));

		PartDefinition FootL4 = FootL3.addOrReplaceChild("FootL4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1297F, -1.4616F, -0.0349F, 0.0F, 0.0F));

		PartDefinition bone2 = Camptosaurus.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offset(-0.8F, -0.9897F, -7.5097F));

		PartDefinition bone4 = Camptosaurus.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offset(0.8F, -0.9897F, -7.5097F));

		PartDefinition body2 = Camptosaurus.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1071F, -3.0884F, 0.0438F, -0.0433F, -0.0057F));

		PartDefinition cube_r5 = body2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(49, 37).addBox(-0.5F, -0.2092F, -0.6091F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.1175F, -4.4213F, -0.096F, 0.0F, 0.0F));

		PartDefinition Body = body2.addOrReplaceChild("Body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2179F, -5.2116F, -0.0436F, -0.0873F, 0.0F));

		PartDefinition cube_r6 = Body.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(17, 38).addBox(-0.5F, 0.7485F, 0.0213F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.181F, -6.6698F, 0.0698F, 0.0F, 0.0F));

		PartDefinition body3 = Body.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, 0.025F, -6.625F, 0.0177F, -0.1745F, -0.0031F));

		PartDefinition cube_r7 = body3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(22, 61).addBox(0.0F, 0.9448F, 2.1445F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1F, -6.0F, 0.2531F, 0.0F, 0.0F));

		PartDefinition Chest = body3.addOrReplaceChild("Chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.4035F, -3.5136F, -0.2167F, -0.0669F, 0.1037F));

		PartDefinition cube_r8 = Chest.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(0, 59).addBox(-0.5F, -1.0F, -0.1F, 1.0F, 2.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.1F, 2.8874F, -1.868F, 0.6993F, 0.0535F, 0.0449F));

		PartDefinition chest2 = Chest.addOrReplaceChild("chest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.6043F, -3.1039F, 0.029F, -0.1288F, -0.0903F));

		PartDefinition cube_r9 = chest2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(38, 42).addBox(-0.5F, -1.0F, -0.2F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.296F, 0.0801F, 0.7333F, 0.0259F, 0.0234F));

		PartDefinition cube_r10 = chest2.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(34, 38).addBox(-0.5F, 0.4321F, -10.5803F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.9F, 2.6F, 0.733F, 0.0F, 0.0F));

		PartDefinition ArmL = chest2.addOrReplaceChild("ArmL", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0072F, 6.6482F, -1.4589F, 0.4571F, 0.2708F, -0.1556F));

		PartDefinition ElbowL = ArmL.addOrReplaceChild("ElbowL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.4721F, 7.2687F, 1.1022F, 0.2077F, 0.15F, 0.2243F));

		PartDefinition HandL = ElbowL.addOrReplaceChild("HandL", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3F, 3.2999F, -4.137F, 0.3316F, 0.0F, 0.0F));

		PartDefinition ArmL2 = chest2.addOrReplaceChild("ArmL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.0072F, 6.6482F, -1.4589F, 0.2825F, -0.2708F, 0.1556F));

		PartDefinition ElbowL2 = ArmL2.addOrReplaceChild("ElbowL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.4721F, 7.2687F, 1.1022F, -0.3976F, -0.0237F, -0.2563F));

		PartDefinition HandL2 = ElbowL2.addOrReplaceChild("HandL2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3F, 3.2999F, -4.137F, 0.7916F, -0.218F, -0.2156F));

		PartDefinition bone = chest2.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offset(0.5F, -2.9F, 3.2F));

		PartDefinition bone3 = chest2.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offset(-0.5F, -2.9F, 3.2F));

		PartDefinition Neck4 = chest2.addOrReplaceChild("Neck4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.6615F, -4.5244F, 0.4644F, -0.248F, -0.0848F));

		PartDefinition cube_r11 = Neck4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(71, 39).addBox(-0.5F, 0.8704F, 2.1754F, 1.0F, 2.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.5739F, -4.9769F, 0.2443F, 0.0F, 0.0F));

		PartDefinition Neck3 = Neck4.addOrReplaceChild("Neck3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.2912F, -2.4818F, 0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r12 = Neck3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(23, 57).addBox(-0.5F, -0.9348F, 3.4697F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(22, 56).addBox(-0.5F, -0.9348F, 1.7696F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1906F, -3.5949F, -0.4189F, 0.0F, 0.0F));

		PartDefinition Neck2 = Neck3.addOrReplaceChild("Neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.8251F, -0.9379F, 0.3142F, 0.0F, 0.0F));

		PartDefinition cube_r13 = Neck2.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(85, 91).addBox(-0.5F, -0.4108F, 5.3661F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(84, 90).addBox(-0.5F, -0.4108F, 3.6661F, 1.0F, 2.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -4.269F, -4.1311F, -0.9861F, 0.0F, 0.0F));

		PartDefinition Neck1 = Neck2.addOrReplaceChild("Neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1102F, -1.0798F, -1.0297F, 0.0F, 0.0F));

		PartDefinition cube_r14 = Neck1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(26, 95).addBox(-0.5F, 0.0545F, 0.4847F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(26, 94).addBox(-0.5F, 0.0545F, -1.2153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0203F, -1.2957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neck5 = Neck1.addOrReplaceChild("Neck5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3113F, -1.885F, -0.6458F, 0.0F, 0.0F));

		PartDefinition cube_r15 = Neck5.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(11, 64).addBox(-0.5F, 0.0545F, -2.6153F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1797F, -0.8957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neck6 = Neck5.addOrReplaceChild("Neck6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1142F, -3.3554F, 0.1484F, 0.0F, 0.0F));

		PartDefinition cube_r16 = Neck6.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(12, 91).addBox(-0.5F, 0.0545F, -0.6153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1797F, -1.0957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Neck7 = Neck6.addOrReplaceChild("Neck7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5502F, -1.7776F, 0.499F, -0.0767F, -0.0417F));

		PartDefinition cube_r17 = Neck7.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(54, 91).addBox(-0.5F, 0.0545F, -0.8153F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.1797F, -1.0957F, -0.3142F, 0.0F, 0.0F));

		PartDefinition Head = Neck7.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.9054F, -1.5919F, 0.2281F, -0.1353F, 0.0214F));

		PartDefinition leftFace = Head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.4354F, 0.8576F, -2.2052F));

		PartDefinition rightFace = Head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.4354F, 0.8576F, -2.2052F));

		PartDefinition Jaw = Head.addOrReplaceChild("Jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.2712F, 0.4795F, 0.48F, 0.0F, 0.0F));

		PartDefinition Tail1 = Camptosaurus.addOrReplaceChild("Tail1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.8528F, -0.339F, 1.0F, 2.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.7F, 4.1F, -0.4396F, 0.1186F, -0.0556F));

		PartDefinition Tail2 = Tail1.addOrReplaceChild("Tail2", CubeListBuilder.create().texOffs(21, 28).addBox(-0.5F, -0.3217F, -0.3194F, 1.0F, 2.0F, 7.0F, new CubeDeformation(-0.15F))
				.texOffs(27, 34).addBox(-0.5F, -0.3217F, 6.3806F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 1.1528F, 9.561F, 0.0176F, 0.1309F, 0.0023F));

		PartDefinition tail = Tail2.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -0.03F, -0.022F, 1.0F, 2.0F, 6.0F, new CubeDeformation(-0.15F))
				.texOffs(47, 5).addBox(-0.5F, -0.03F, 5.678F, 1.0F, 2.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.2918F, 7.0025F, -0.0175F, 0.0873F, -0.0015F));

		PartDefinition Tail3 = tail.addOrReplaceChild("Tail3", CubeListBuilder.create().texOffs(17, 48).addBox(-0.5F, 0.3728F, -0.0026F, 1.0F, 2.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.437F, 5.9355F, 0.1936F, -0.1285F, -0.0251F));

		PartDefinition Tail4 = Tail3.addOrReplaceChild("Tail4", CubeListBuilder.create().texOffs(38, 28).addBox(-0.5F, 0.4887F, -0.069F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.236F, 4.5664F, 0.0709F, -0.1741F, -0.0123F));

		PartDefinition Tail5 = Tail4.addOrReplaceChild("Tail5", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.5F, -0.6F, 1.0F, 1.0F, 9.0F, new CubeDeformation(-0.15F))
				.texOffs(8, 31).addBox(-0.5F, 0.5F, 8.1F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0988F, 7.1956F, 0.0447F, -0.218F, -0.0097F));

		PartDefinition Tail6 = Tail5.addOrReplaceChild("Tail6", CubeListBuilder.create().texOffs(23, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2992F, 8.6212F, 0.009F, -0.2618F, -0.0023F));

		PartDefinition Tail7 = Tail6.addOrReplaceChild("Tail7", CubeListBuilder.create().texOffs(23, 10).addBox(-0.5F, 0.2F, -0.2F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0007F, 7.9256F, -0.0813F, -0.261F, 0.021F));

		PartDefinition Tail8 = Tail7.addOrReplaceChild("Tail8", CubeListBuilder.create().texOffs(42, 9).addBox(-0.5F, 0.2F, -0.4F, 1.0F, 1.0F, 6.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0236F, 7.9477F, -0.1355F, -0.2595F, 0.035F));

		return LayerDefinition.create(meshdefinition, 123, 123);
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