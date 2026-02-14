package fossils.fossils.client.blockentity.model.cycnorhamphus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class CycnorhamphusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart chest;
	private final ModelPart leftwing1;
	private final ModelPart leftwing2;
	private final ModelPart leftwing3;
	private final ModelPart lefthand2;
	private final ModelPart leftwing4;
	private final ModelPart leftwing5;
	private final ModelPart leftwing7;
	private final ModelPart leftwing8;
	private final ModelPart leftwing6;
	private final ModelPart leftwing5membrance2;
	private final ModelPart leftwing1membrance;
	private final ModelPart rightwing1;
	private final ModelPart rightwing2;
	private final ModelPart rightwing3;
	private final ModelPart righthand2;
	private final ModelPart rightwing4;
	private final ModelPart rightwing5;
	private final ModelPart rightwing7;
	private final ModelPart rightwing8;
	private final ModelPart rightwing6;
	private final ModelPart rightwing5membrance2;
	private final ModelPart rightwing1membrance;
	private final ModelPart bone2;
	private final ModelPart bone4;
	private final ModelPart body3;
	private final ModelPart body2;
	private final ModelPart body;
	private final ModelPart body1;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
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
	private final ModelPart bone;
	private final ModelPart bone3;
	private final ModelPart neck1;
	private final ModelPart neck2;
	private final ModelPart neck3;
	private final ModelPart neck4;
	private final ModelPart neck5;
	private final ModelPart neck6;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart jaw;

	public CycnorhamphusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.chest = this.root.getChild("chest");
		this.leftwing1 = this.chest.getChild("leftwing1");
		this.leftwing2 = this.leftwing1.getChild("leftwing2");
		this.leftwing3 = this.leftwing2.getChild("leftwing3");
		this.lefthand2 = this.leftwing3.getChild("lefthand2");
		this.leftwing4 = this.leftwing3.getChild("leftwing4");
		this.leftwing5 = this.leftwing4.getChild("leftwing5");
		this.leftwing7 = this.leftwing5.getChild("leftwing7");
		this.leftwing8 = this.leftwing7.getChild("leftwing8");
		this.leftwing6 = this.leftwing4.getChild("leftwing6");
		this.leftwing5membrance2 = this.leftwing6.getChild("leftwing5membrance2");
		this.leftwing1membrance = this.leftwing1.getChild("leftwing1membrance");
		this.rightwing1 = this.chest.getChild("rightwing1");
		this.rightwing2 = this.rightwing1.getChild("rightwing2");
		this.rightwing3 = this.rightwing2.getChild("rightwing3");
		this.righthand2 = this.rightwing3.getChild("righthand2");
		this.rightwing4 = this.rightwing3.getChild("rightwing4");
		this.rightwing5 = this.rightwing4.getChild("rightwing5");
		this.rightwing7 = this.rightwing5.getChild("rightwing7");
		this.rightwing8 = this.rightwing7.getChild("rightwing8");
		this.rightwing6 = this.rightwing4.getChild("rightwing6");
		this.rightwing5membrance2 = this.rightwing6.getChild("rightwing5membrance2");
		this.rightwing1membrance = this.rightwing1.getChild("rightwing1membrance");
		this.bone2 = this.chest.getChild("bone2");
		this.bone4 = this.chest.getChild("bone4");
		this.body3 = this.chest.getChild("body3");
		this.body2 = this.body3.getChild("body2");
		this.body = this.body2.getChild("body");
		this.body1 = this.body.getChild("body1");
		this.tail1 = this.body1.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.leftLeg = this.body1.getChild("leftLeg");
		this.leftLegMembrane = this.leftLeg.getChild("leftLegMembrane");
		this.leftLeg2 = this.leftLeg.getChild("leftLeg2");
		this.leftLeg3 = this.leftLeg2.getChild("leftLeg3");
		this.finger = this.leftLeg3.getChild("finger");
		this.leftLeg4 = this.leftLeg3.getChild("leftLeg4");
		this.rightLeg = this.body1.getChild("rightLeg");
		this.rightLegMembrane = this.rightLeg.getChild("rightLegMembrane");
		this.rightLeg2 = this.rightLeg.getChild("rightLeg2");
		this.rightLeg3 = this.rightLeg2.getChild("rightLeg3");
		this.finger2 = this.rightLeg3.getChild("finger2");
		this.rightLeg4 = this.rightLeg3.getChild("rightLeg4");
		this.bone = this.body1.getChild("bone");
		this.bone3 = this.body1.getChild("bone3");
		this.neck1 = this.chest.getChild("neck1");
		this.neck2 = this.neck1.getChild("neck2");
		this.neck3 = this.neck2.getChild("neck3");
		this.neck4 = this.neck3.getChild("neck4");
		this.neck5 = this.neck4.getChild("neck5");
		this.neck6 = this.neck5.getChild("neck6");
		this.head = this.neck6.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.jaw = this.head.getChild("jaw");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(1, 1).addBox(-0.5F, -32.4F, -0.4F, 1.0F, 33.0F, 1.0F, new CubeDeformation(-0.21F))
				.texOffs(1, 1).addBox(0.15F, -25.7F, 11.0F, 1.0F, 26.0F, 1.0F, new CubeDeformation(-0.21F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-0.4F, -2.5F, -0.5F, 1.0F, 4.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, -24.7F, 11.5F, 0.0F, 0.0F, 1.6144F));

		PartDefinition cube_r2 = fossil.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(1, 1).addBox(-7.5F, -3.3F, -0.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.1F, -23.0F, 0.1F, 0.0F, 0.0F, 1.5708F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -23.5F, -8.0F));

		PartDefinition chest = root.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -8.693F, 9.1613F, -0.4005F, 0.0F, 0.0F));

		PartDefinition chest_r1 = chest.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(68, 77).addBox(-0.5F, -0.1554F, -3.0856F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.3F, 1.5F, 0.1396F, 0.0F, 0.0F));

		PartDefinition leftwing1 = chest.addOrReplaceChild("leftwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6239F, 1.9768F, -1.0125F, 0.3113F, -0.5206F, 0.6983F));

		PartDefinition leftwing2 = leftwing1.addOrReplaceChild("leftwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(10.4669F, 0.3964F, -0.9368F, -1.6694F, 0.4635F, -1.6052F));

		PartDefinition leftwing3 = leftwing2.addOrReplaceChild("leftwing3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5456F, 13.6746F, -0.0815F, 0.7354F, 0.4748F, 0.6638F));

		PartDefinition lefthand2 = leftwing3.addOrReplaceChild("lefthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.1066F, 16.2342F, 0.8308F, -0.3936F, 0.5357F, 0.3398F));

		PartDefinition leftwing4 = leftwing3.addOrReplaceChild("leftwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1831F, 16.2114F, 0.6579F, 1.2486F, -0.1983F, -0.2533F));

		PartDefinition leftwing5 = leftwing4.addOrReplaceChild("leftwing5", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0028F, 0.1649F, 21.3633F, 0.2767F, -0.0101F, 0.1844F));

		PartDefinition leftwing7 = leftwing5.addOrReplaceChild("leftwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1189F, 0.1901F, 16.3617F, 0.2781F, -0.0982F, 0.1593F));

		PartDefinition leftwing8 = leftwing7.addOrReplaceChild("leftwing8", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.0788F, 0.1381F, 11.3834F, 0.3209F, 0.0636F, 0.1951F));

		PartDefinition leftwing6 = leftwing4.addOrReplaceChild("leftwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.8201F, 0.4836F, 8.746F, 0.0594F, 0.0781F, 0.2095F));

		PartDefinition leftwing5membrance2 = leftwing6.addOrReplaceChild("leftwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition leftwing1membrance = leftwing1.addOrReplaceChild("leftwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3497F, 0.2368F, 2.9355F, 0.0021F, -0.3752F, -0.0093F));

		PartDefinition rightwing1 = chest.addOrReplaceChild("rightwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(-3.6239F, 2.9768F, -1.0125F, 1.8494F, 1.2822F, 1.094F));

		PartDefinition rightwing2 = rightwing1.addOrReplaceChild("rightwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-10.4669F, 0.3964F, -0.9368F, -2.1057F, -0.4635F, 1.6052F));

		PartDefinition rightwing3 = rightwing2.addOrReplaceChild("rightwing3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5456F, 13.6746F, -0.0815F, 0.7044F, -0.5592F, -0.7091F));

		PartDefinition righthand2 = rightwing3.addOrReplaceChild("righthand2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1066F, 16.2342F, 0.3308F, -0.1431F, -0.5041F, -0.1419F));

		PartDefinition rightwing4 = rightwing3.addOrReplaceChild("rightwing4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1831F, 16.2114F, 0.6579F, 1.2486F, 0.1983F, 0.2533F));

		PartDefinition rightwing5 = rightwing4.addOrReplaceChild("rightwing5", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0028F, 0.1649F, 21.3633F, 0.2767F, 0.0101F, -0.1844F));

		PartDefinition rightwing7 = rightwing5.addOrReplaceChild("rightwing7", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1189F, 0.1901F, 16.3617F, 0.2781F, 0.0982F, -0.1593F));

		PartDefinition rightwing8 = rightwing7.addOrReplaceChild("rightwing8", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0788F, 0.1381F, 11.3834F, 0.3209F, -0.0636F, -0.1951F));

		PartDefinition rightwing6 = rightwing4.addOrReplaceChild("rightwing6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8201F, 0.4836F, 8.746F, 0.0594F, -0.0781F, -0.2095F));

		PartDefinition rightwing5membrance2 = rightwing6.addOrReplaceChild("rightwing5membrance2", CubeListBuilder.create(), PartPose.offset(0.0F, -0.9559F, 4.6511F));

		PartDefinition rightwing1membrance = rightwing1.addOrReplaceChild("rightwing1membrance", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3496F, 0.2368F, 2.9355F, 0.0021F, 0.3752F, 0.0093F));

		PartDefinition bone2 = chest.addOrReplaceChild("bone2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2719F, 1.4222F, -1.0716F, -0.2182F, 0.0F, 0.0F));

		PartDefinition bone4 = chest.addOrReplaceChild("bone4", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2719F, 1.4222F, -1.0716F, -0.2182F, 0.0F, 0.0F));

		PartDefinition body3 = chest.addOrReplaceChild("body3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.7122F, 1.4007F, -0.2269F, 0.0F, 0.0F));

		PartDefinition chest_r2 = body3.addOrReplaceChild("chest_r2", CubeListBuilder.create().texOffs(76, 61).addBox(-0.5F, 0.025F, 1.25F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3609F, -1.4963F, 0.0873F, 0.0F, 0.0F));

		PartDefinition body2 = body3.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.1672F, 2.5994F, 0.1612F, 0.0793F, 0.0569F));

		PartDefinition body4_r1 = body2.addOrReplaceChild("body4_r1", CubeListBuilder.create().texOffs(75, 43).addBox(-0.5F, 0.0655F, -2.751F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4479F, 2.5046F, -0.1309F, -0.0173F, 0.0023F));

		PartDefinition body = body2.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.4479F, 2.7046F, -0.0349F, 0.0F, 0.0F));

		PartDefinition body3_r1 = body.addOrReplaceChild("body3_r1", CubeListBuilder.create().texOffs(52, 65).addBox(-0.5F, -0.3F, 2.575F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0F, -3.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition body1 = body.addOrReplaceChild("body1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3033F, 3.6022F, -0.0138F, 0.0F, 0.0F));

		PartDefinition body2_r1 = body1.addOrReplaceChild("body2_r1", CubeListBuilder.create().texOffs(65, 62).addBox(-0.5F, 0.2697F, -3.0889F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.2105F, 2.6253F, -0.0785F, 0.0F, 0.0F));

		PartDefinition tail1 = body1.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(85, 3).addBox(-0.5F, 0.402F, -0.5471F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F))
				.texOffs(86, 4).addBox(-0.5F, 0.402F, 1.0529F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.1685F, 3.7018F, -0.1665F, 0.0F, 0.0F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(85, 7).addBox(-0.5F, 0.0988F, -0.1011F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.3087F, 1.6342F, 0.1423F, 0.0F, 0.0F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(85, 11).addBox(-0.5F, 0.025F, -0.25F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0969F, 1.5027F, 0.3054F, 0.0F, 0.0F));

		PartDefinition leftLeg = body1.addOrReplaceChild("leftLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(1.3329F, 0.6193F, 2.6502F, 0.4392F, -0.1363F, -0.2469F));

		PartDefinition leftLegMembrane = leftLeg.addOrReplaceChild("leftLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, 1.2F));

		PartDefinition leftLeg2 = leftLeg.addOrReplaceChild("leftLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2038F, 9.8737F, 0.1566F, 0.7477F, -0.0588F, 0.0776F));

		PartDefinition leftLeg3 = leftLeg2.addOrReplaceChild("leftLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.3373F, 15.92F, -0.2614F, -0.1092F, 0.1435F, -0.0268F));

		PartDefinition finger = leftLeg3.addOrReplaceChild("finger", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.7243F, -0.1695F, 0.0302F, 0.0643F, -0.2724F, -0.0431F));

		PartDefinition leftLeg4 = leftLeg3.addOrReplaceChild("leftLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5883F, -3.9649F, -0.5229F, 0.0F, 0.0F));

		PartDefinition rightLeg = body1.addOrReplaceChild("rightLeg", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.3329F, 0.6193F, 2.6502F, -0.0844F, 0.1363F, 0.2469F));

		PartDefinition rightLegMembrane = rightLeg.addOrReplaceChild("rightLegMembrane", CubeListBuilder.create(), PartPose.offset(0.0F, 1.3F, 1.2F));

		PartDefinition rightLeg2 = rightLeg.addOrReplaceChild("rightLeg2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2038F, 9.8737F, 0.1566F, 0.5295F, 0.0588F, -0.0776F));

		PartDefinition rightLeg3 = rightLeg2.addOrReplaceChild("rightLeg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.3373F, 15.92F, -0.2614F, 0.3838F, -0.1525F, -0.0609F));

		PartDefinition finger2 = rightLeg3.addOrReplaceChild("finger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.7243F, -0.1695F, 0.0302F, 0.0643F, 0.2724F, 0.0431F));

		PartDefinition rightLeg4 = rightLeg3.addOrReplaceChild("rightLeg4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5883F, -3.9649F, -0.2611F, 0.0F, 0.0F));

		PartDefinition bone = body1.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(1.0844F, 1.0436F, 1.2034F, 0.4552F, 0.0791F, 0.037F));

		PartDefinition bone3 = body1.addOrReplaceChild("bone3", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.0844F, 1.0436F, 1.2034F, 0.4552F, -0.0791F, -0.037F));

		PartDefinition neck1 = chest.addOrReplaceChild("neck1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2503F, -1.2088F, -0.1148F, -0.1838F, -0.0654F));

		PartDefinition cube_r3 = neck1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(77, 33).addBox(-0.5F, 0.125F, 0.375F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.4684F, -3.1978F, 0.1309F, 0.0F, 0.0F));

		PartDefinition neck2 = neck1.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(78, 58).addBox(-0.5F, 0.1213F, -0.5481F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.2F))
				.texOffs(76, 56).addBox(-0.5F, 0.1213F, -3.1481F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.372F, -2.5937F, -0.119F, -0.184F, -0.0647F));

		PartDefinition neck3 = neck2.addOrReplaceChild("neck3", CubeListBuilder.create().texOffs(76, 48).addBox(-0.5F, 0.089F, -2.909F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.057F, -2.6323F, -0.2897F, 0.0F, 0.0F));

		PartDefinition neck4 = neck3.addOrReplaceChild("neck4", CubeListBuilder.create().texOffs(77, 28).addBox(-0.5F, -0.0007F, -2.7222F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, 0.0996F, -2.6108F, -0.2548F, 0.0F, 0.0F));

		PartDefinition neck5 = neck4.addOrReplaceChild("neck5", CubeListBuilder.create().texOffs(76, 15).addBox(-0.5F, 0.2054F, -2.9726F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2028F, -2.4339F, 0.2339F, 0.0F, 0.0F));

		PartDefinition neck6 = neck5.addOrReplaceChild("neck6", CubeListBuilder.create().texOffs(14, 91).addBox(-0.5F, 0.2054F, -2.3725F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.2F)), PartPose.offsetAndRotation(0.0F, -0.2583F, -2.6867F, 0.8011F, 0.0F, 0.0F));

		PartDefinition head = neck6.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.1321F, -1.1163F, 0.7096F, -0.1423F, -0.1014F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.1125F, -1.3426F, -2.6406F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.1125F, -1.3426F, -2.6406F));

		PartDefinition jaw = head.addOrReplaceChild("jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.8888F, -2.4789F, -0.3229F, 0.0F, 0.0F));

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